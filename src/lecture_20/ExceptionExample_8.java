package lecture_20;

import java.io.IOException;

public class ExceptionExample_8 {
    public static void main(String[] args) {
        try {
            methodWhereExceptionExpected1();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello Metallica");
    }

    public static void methodWhereExceptionExpected1() throws IOException {
        methodWhereExceptionExpected2();
    }

    public static void methodWhereExceptionExpected2() throws IOException {
        methodWhereExceptionExpected3();
    }

    public static void methodWhereExceptionExpected3() throws IOException {
        throw new IOException();

    }

}
