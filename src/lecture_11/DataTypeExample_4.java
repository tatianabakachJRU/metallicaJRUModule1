package lecture_11;

public class DataTypeExample_4 {
    public static void main(String[] args) {
        int number = Integer.MAX_VALUE;
        System.out.println(number);

        System.out.println(number + 1);

        byte byteNumber = 127; //-128 -127 -126
        System.out.println((byte) (byteNumber + 10));

        int a = 10, b = Integer.MAX_VALUE;

        if (a > 0 && b > Integer.MAX_VALUE - a) {
            System.out.println("При сложении произойдет переполнение типа");
        } else {
            System.out.println(a + b);
        }
    }
}
