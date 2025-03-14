package lecture_15;

public class WrappersExample_3 {
    public static void main(String[] args) {
        Double number = 1.23;

        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.MAX_VALUE);
        System.out.println(Double.MIN_VALUE);
        System.out.println(Double.MAX_EXPONENT);
        System.out.println(Double.MIN_EXPONENT);

        System.out.println(Double.toHexString(number));
        System.out.println(Double.isInfinite(number));
        System.out.println(Double.isNaN(number));

    }
}
