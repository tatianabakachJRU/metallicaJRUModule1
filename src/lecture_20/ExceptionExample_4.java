package lecture_20;

public class ExceptionExample_4 {
    public static void main(String[] args) {
        try {
            methodWhereExceptionExpected(10, 0);
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception from main");
        }
        System.out.println("Hello Metallica");
    }

    public static void methodWhereExceptionExpected(int a, int b) throws ArithmeticException {
        System.out.println("Before exception");
        int result = a / b; // ArithmeticException
        System.out.println("Result: " + result);
        System.out.println("After exception");
    }

}
