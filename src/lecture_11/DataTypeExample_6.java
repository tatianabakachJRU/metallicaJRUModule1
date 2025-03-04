package lecture_11;

public class DataTypeExample_6 {
    public static void main(String[] args) {
        byte byteNumber = 100; // 1 байт
        short shortNumber = byteNumber; // 2
        int intNumber = shortNumber; // 4
        long longNumber = intNumber; // 8

        long longValue = 1000L;
        int intValue = (int) longValue;
        byte byteValue = (byte) intValue;
        System.out.println(byteValue);

        double doubleValue = longValue;
        intValue = (int) doubleValue;
        byte result = (byte) (longValue + intValue);
        longValue = (long) doubleValue;


    }
}
