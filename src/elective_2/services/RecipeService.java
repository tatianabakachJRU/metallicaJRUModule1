package elective_2.services;

import elective_2.exceptions.NoRatingException;
import elective_2.exceptions.RecipeNotFoundException;
import elective_2.model.Recipe;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class RecipeService {
    private Map<String, Recipe> recipes = new HashMap<>();
    private RatingService ratingService;

    public RecipeService(RatingService ratingService) {
        this.ratingService = ratingService;
    }

    public Recipe getRecipe(String name){
        String key = name.toLowerCase();
        Recipe recipe = recipes.get(key);
        if(recipe == null){
            throw new RecipeNotFoundException(name);
        }
        return recipe;
    }

    public void loadRecipe(String fileName) throws IOException {
        Path path = Paths.get(fileName);
        if(!Files.exists(path)) return;

        List<String> lines = Files.readAllLines(path);
        String currentName = null;
        List<String> ingredients = new ArrayList<>();
        List<String> steps = new ArrayList<>();

        for (String line : lines) {
            if(line.startsWith("###")){
                if(currentName != null){
                    recipes.put(currentName, new Recipe(ingredients, steps));
                }
                currentName = line.substring(3).trim().toLowerCase();
                ingredients.clear();
                steps.clear();
            } else if(!line.isEmpty()) {
                if(ingredients.isEmpty()){
                    Collections.addAll(ingredients, line.split(","));
                } else {
                    Collections.addAll(steps, line.split("\\|"));
                }
            }
        }
        if(currentName != null){
            recipes.put(currentName, new Recipe(ingredients, steps));
        }
    }

    public double getAverageRating(String recipeName){
        Map<String, List<Integer>> ratings = ratingService.getRatings();
        List<Integer> recipeRating = ratings.get(recipeName.toLowerCase());

        if(recipeRating == null || recipeRating.isEmpty()){
            throw new NoRatingException(recipeName);
        }

        int sum = 0;
        for (Integer rating : recipeRating) {
            sum += rating;
        }
        return (double) sum /recipeRating.size();
    }
}
