package lecture_20;

import java.util.Arrays;

public class ExceptionExample_11 {
    public static void main(String[] args) {
        methodWhereExceptionExpected(10, 0);
        System.out.println("Hello Metallica");
    }

    public static void methodWhereExceptionExpected(int a, int b) {
        try {
            String str = null;
            System.out.println(str.length()); // NullPointerException
            int number = Integer.parseInt("abc"); // NumberFormatException
            System.out.println("Before exception");
            int result = a / b; // ArithmeticException
            System.out.println("Result: " + result);
            System.out.println("After exception");
        } catch (ArithmeticException | NullPointerException | NumberFormatException exception) {
            System.out.println(Arrays.toString(exception.getStackTrace()));
        } finally {
            System.out.println("finally: Will be executed in any case");
        }

    }

}
