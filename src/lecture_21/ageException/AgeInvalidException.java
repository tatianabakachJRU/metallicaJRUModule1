package lecture_21.ageException;

public class AgeInvalidException extends RuntimeException{
    public AgeInvalidException(String message) {
        super(message);
    }
}
