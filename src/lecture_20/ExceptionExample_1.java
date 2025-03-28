package lecture_20;

public class ExceptionExample_1 {
    public static void main(String[] args) {
        methodWhereExceptionExpected(10, 0);
        System.out.println("Hello Metallica");
    }

    public static void methodWhereExceptionExpected(int a, int b) {
        System.out.println("Before exception");
        int result = a / b; // ArithmeticException
        System.out.println("Result: " + result);
        System.out.println("After exception");
    }
}
