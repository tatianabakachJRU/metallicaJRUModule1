package lecture_6;

import java.util.Arrays;

public class ArrayExample_6 {
    public static void main(String[] args) {
        int[] numbers = new int[4];
        Arrays.fill(numbers, 100);
        System.out.println(Arrays.toString(numbers));

        String[] strings = new String[10];
        Arrays.fill(strings, 3, 7, "Java");
        System.out.println(Arrays.toString(strings));
    }
}
