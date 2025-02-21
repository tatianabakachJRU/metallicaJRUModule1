package lecture_8.mathcat;

public class MathCat {

    private static int number = 3;

    public void result(int a, int b) {
        System.out.println(number);
        System.out.println("a + b = " + (a + b));
    }

    // разные по количеству
    // разные по порядку следования
    // разные по типу
//    public void result(int number1, int b) {
//        System.out.println("a + b = " + (number1 + b));
//    }

    public void result(double a, int b) {
        result(1, 2);
        System.out.println("a + b = " + (a + b));
    }

    public void result(int a, double b) {
        System.out.println("a + b = " + (a + b));
    }

    public void result(double a, int b, int c) {
        System.out.println("a + b + c = " + (a + b + c));
    }
}
