package elective_2.exceptions;

public class NoRatingException extends RuntimeException {
    public NoRatingException(String name) {
        super("Рецепт " + name + " еще не оценивался");
    }
}
