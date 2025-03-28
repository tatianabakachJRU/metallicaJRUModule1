package lecture_20;

import java.io.IOException;

public class ExceptionExample_7 {
    public static void main(String[] args) {
        methodWhereExceptionExpected();
        System.out.println("Hello Metallica");
    }

    public static void methodWhereExceptionExpected() {
        throw new RuntimeException(); // unchecked exception
        //throw new IOException(); // checked exception
    }

}
