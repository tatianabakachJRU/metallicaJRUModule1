package lecture_21.catException;

public class CatException extends Exception{

    public CatException() {
    }

    public CatException(String message) {
        super(message);
    }

    public CatException(String message, Throwable cause) {
        super(message, cause);
    }

    public CatException(String message, Throwable cause,
                        boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
