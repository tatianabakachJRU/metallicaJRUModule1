package lecture_6;

import java.util.Arrays;

public class ArrayExample_8 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] ints = Arrays.copyOf(numbers, numbers.length);
        System.out.println(Arrays.toString(ints));
        int[] ints1 = Arrays.copyOf(numbers, numbers.length + 3);
        ints1[9] = 40;
        System.out.println(Arrays.toString(ints1));
        int[] ints2 = Arrays.copyOf(numbers, 3);
        System.out.println(Arrays.toString(ints2));

        int[] ints3 = Arrays.copyOfRange(numbers, 0, 4);
        System.out.println(Arrays.toString(ints3));

        String str = "Hello";
        int length1 = str.length();
        System.out.println(length1);


        int length = ints1.length;
        System.out.println(length);


    }
}
