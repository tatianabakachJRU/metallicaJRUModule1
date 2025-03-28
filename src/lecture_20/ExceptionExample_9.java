package lecture_20;

import java.io.IOException;

public class ExceptionExample_9 {
    public static void main(String[] args) {
        methodWhereExceptionExpected1();
//        try {
//            methodWhereExceptionExpected1();
//        } catch (RuntimeException e) {
//            System.out.println("Runtime Exception");;
//        }
        System.out.println("Hello Metallica");
    }

    public static void methodWhereExceptionExpected1() {
        methodWhereExceptionExpected2();
    }

    public static void methodWhereExceptionExpected2() {
        methodWhereExceptionExpected3();
    }

    public static void methodWhereExceptionExpected3() {
        throw new RuntimeException();

    }

}
