package elective_2;

import elective_2.exceptions.InvalidRatingException;
import elective_2.exceptions.NoRatingException;
import elective_2.exceptions.RecipeNotFoundException;
import elective_2.model.Recipe;
import elective_2.services.RatingService;
import elective_2.services.RecipeService;
import elective_2.validation.Validator;

import java.io.IOException;
import java.util.Scanner;

public class RecipeApp {
    private static RecipeService recipeService;
    private static RatingService ratingService;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ratingService = new RatingService();
        recipeService = new RecipeService(ratingService);
        try {
            recipeService.loadRecipe("recipes.txt");
            ratingService.loadRatings("ratings.txt");

            while (true){
                displayMenu();
                String choice = scanner.nextLine();

                if(choice.equals("3")) break;
                handleUserChoice(choice);
            }
        } catch (IOException e) {
            System.out.println("Ошибка при работе с файлами: " + e.getMessage());
        } finally {
            try {
                ratingService.saveRating("ratings.txt");
            } catch (IOException e) {
                System.out.println("Ошибка сохранения оценки: " + e.getMessage());
            }
            scanner.close();
        }
    }

    private static void handleUserChoice(String choice) {
        switch (choice){
            case "1" -> searchRecipe();
            case "2" -> reteRecipe();
            default -> System.out.println("Неверный ввод. " +
                    "Пожалуйста, выберите 1, 2 или 3");
        }

    }

    private static void reteRecipe() {
        System.out.print("Введите название рецепта: ");
        String recipeName = scanner.nextLine();

        try {
            recipeService.getRecipe(recipeName);
            System.out.println("Введите оценку от 1 до 5: ");
            int rating = Integer.parseInt(scanner.nextLine());
            Validator.validRating(rating);

            ratingService.addRating(recipeName, rating);
            ratingService.saveRating("ratings.txt");
            System.out.println("Спасибо за оценку!");
        }catch (NumberFormatException e) {
            System.out.println("Введите число от 1 до 5");
        } catch (InvalidRatingException | RecipeNotFoundException | IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void searchRecipe() {
        System.out.print("Введите название рецепта: ");
        String name = scanner.nextLine();

        try {
            Validator.validRecipeName(name);
            Recipe recipe = recipeService.getRecipe(name);
            System.out.println("\n" + name.toUpperCase() + "\n" + recipe);

            try {
                double averageRating = recipeService.getAverageRating(name);
                System.out.printf("Средний рейтинг: %.1f\n", averageRating);
            } catch (NoRatingException e){
                System.out.println(e.getMessage());
            }
        } catch (RecipeNotFoundException | InvalidRatingException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void displayMenu() {
        System.out.println("""
                1. Поиск рецепта
                2. Оценка рецепта
                3. Выход
                """);
        System.out.print("Выберите действие:");
    }

}
