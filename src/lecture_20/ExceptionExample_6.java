package lecture_20;

public class ExceptionExample_6 {
    public static void main(String[] args) {
        methodWhereExceptionExpected(10, 0);
        System.out.println("Hello Metallica");
    }

    public static void methodWhereExceptionExpected(int a, int b) {
        try {
            System.out.println("Before exception");
            String str = null;
            System.out.println(str.length()); // NullPointerException
            int number = Integer.parseInt("abc"); // NumberFormatException
            int result = a / b; // ArithmeticException
            System.out.println("Result: " + result);
            System.out.println("After exception");
        } finally {
            System.out.println("finally: Will be executed in any case");
        }

    }

}
