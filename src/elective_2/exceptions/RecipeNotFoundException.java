package elective_2.exceptions;

public class RecipeNotFoundException extends RuntimeException{
    public RecipeNotFoundException(String name) {
        super("Рецепт " + name + " не найден");
    }
}
