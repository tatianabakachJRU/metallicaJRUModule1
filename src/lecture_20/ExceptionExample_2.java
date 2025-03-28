package lecture_20;

public class ExceptionExample_2 {
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
        } catch (ArithmeticException exception) {
            System.out.println("catch1: You can't divide by zero!!!");
            System.out.println(exception.getMessage());
        } catch (NullPointerException e) {
            System.out.println("catch2: Exception caught: Null Pointer Exception");
            //return;
        } catch (NumberFormatException e) {
            System.out.println("catch3: Exception caught: Number Format Exception");
        } finally {
            System.out.println("finally: Will be executed in any case");
        }

    }

}
