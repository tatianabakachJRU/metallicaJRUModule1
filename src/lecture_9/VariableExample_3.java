package lecture_9;

public class VariableExample_3 {

    static int number = 10;

    public static void main(String[] args) {
        int number = 20;

        System.out.println("Локальная переменная метода: " + number);
        System.out.println("Переменная класса: " + VariableExample_3.number);
    }
}
