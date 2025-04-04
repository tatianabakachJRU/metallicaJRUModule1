package lecture_21.catException;

public class CatExceptionApp {
    public static void main(String[] args) {
        try{
            IllegalArgumentException cause
                    = new IllegalArgumentException("Котик пытался запрыгнуть " +
                    "на очень высокую полку");
            CatException catException = new CatException(
                    "Ошибка в приложении котиков: котик не смог достичь необходимой полки",
                    cause,
                    false,
                    false
            );

            catException.addSuppressed(new Exception("Ошибка из-за плохой " +
                    "лестницы для котиков"));
            throw catException; // вызов нашего исключения
        } catch (CatException e) {
            System.out.println("Сообщение: " + e.getMessage());
            System.out.println("Причина: " + e.getCause());
            System.out.println("Подавляемое исключение:");
            for (Throwable throwable : e.getSuppressed()) {
                System.out.println("Подавлено: " + throwable.getMessage());
            }
            e.printStackTrace();

        }
    }
}
