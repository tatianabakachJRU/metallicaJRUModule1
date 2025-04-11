package elective_2.exceptions;

public class InvalidRatingException extends RuntimeException{
    public InvalidRatingException() {
        super("Оценка должна быть от 1 до 5!");
    }
}
