package lecture_11;

public class DataTypeExample_5 {
    public static void main(String[] args) {
        double number1 = Double.MAX_VALUE;
        double number2 = Double.MAX_VALUE;
        System.out.println(number1 + number2);

        System.out.println(10.0 / 0.0); // 0.00.......1

        double inf = 1.0 / 0.0;

        System.out.println(inf);
        System.out.println(inf + inf);
        System.out.println(inf * inf);
        System.out.println(inf / 0.0);
        double nan = 0.0/ 0.0;
        System.out.println(nan);
        System.out.println(nan + 10);
        System.out.println(nan * nan);
        System.out.println(inf / inf);

    }
}
