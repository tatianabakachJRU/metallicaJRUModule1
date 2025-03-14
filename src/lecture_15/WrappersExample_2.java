package lecture_15;

public class WrappersExample_2 {
    public static void main(String[] args) {
        Integer numberInteger = 10;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.toHexString(numberInteger));
        System.out.println(Integer.toOctalString(numberInteger));
        System.out.println(Integer.toBinaryString(numberInteger));
        Integer i = Integer.parseInt("123");
        System.out.println(i);

    }
}
