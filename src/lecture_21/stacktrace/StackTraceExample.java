package lecture_21.stacktrace;

public class StackTraceExample {
    public static void main(String[] args) {
        try{
            methodOne();
        } catch (RuntimeException e){
            e.printStackTrace();
        }
    }

    private static void methodOne() {
        methodTwo();
    }

    private static void methodTwo() {
        methodThree();
    }

    private static void methodThree() {
        methodFour();
    }

    private static void methodFour() {
        throw new RuntimeException("Что-то пошло не так!");
    }
}
