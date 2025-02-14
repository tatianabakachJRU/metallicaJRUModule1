package lecture_6;

import java.util.Arrays;

public class ArrayExample_5 {
    public static void main(String[] args) {
        int[] numberArray1 = {1, 2, 3, 4, 5};
        int[] numberArray2 = {1, 2, 3, 4};

        System.out.println(Arrays.equals(numberArray1, numberArray2));

        String[] stringsArray1 = {"Vania", "Tania", "Petr"};
        String[] stringsArray2 = {"Tania", "Vania", "Petr"};

        System.out.println(Arrays.equals(stringsArray1, stringsArray2));
    }
}
