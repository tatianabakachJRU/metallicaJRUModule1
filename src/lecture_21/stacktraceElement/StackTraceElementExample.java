package lecture_21.stacktraceElement;

public class StackTraceElementExample {
    public static void main(String[] args) {
        try{
            methodThatThrowException();
        } catch (RuntimeException e){
            e.printStackTrace();
            StackTraceElement[] stackTraceElements = e.getStackTrace();
            for (StackTraceElement element : stackTraceElements) {
                System.out.println("Class: " + element.getClassName());
                System.out.println("Method: " + element.getMethodName());
                System.out.println("File: " + element.getFileName());
                System.out.println("Line: " + element.getLineNumber());
            }
        }
    }

    public static void methodThatThrowException(){
        throw new RuntimeException("Exception message");
    }
}
