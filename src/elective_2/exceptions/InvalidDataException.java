package elective_2.exceptions;

public class InvalidDataException extends RuntimeException{
    public InvalidDataException() {
        super("Ошибка формата данных!");
    }
}
