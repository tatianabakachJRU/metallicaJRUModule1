package elective_2.model;

import java.util.ArrayList;
import java.util.List;

public class Recipe {
    private List<String> ingredients;
    private List<String> steps;

    public Recipe(List<String> ingredients, List<String> steps) {
        this.ingredients = new ArrayList<>(ingredients);
        this.steps = new ArrayList<>(steps);
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public List<String> getSteps() {
        return steps;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Ингредиенты:\n");
        for (String ingredient : ingredients) {
            stringBuilder.append(ingredient).append("\n");
        }
        stringBuilder.append("Шаги:\n");
        for (String step : steps) {
            stringBuilder.append(step).append("\n");
        }
        return stringBuilder.toString();
    }
}
