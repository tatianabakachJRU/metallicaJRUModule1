package lecture_6;

import java.util.Arrays;

public class ArrayExample_7 {
    public static void main(String[] args) {
        int[] numbers = {-100, 100, 0, 2, 7, 5, -9, -2, 4};
        System.out.println(Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String[] stringsArray1 = {"Vania", "Tania", "Petr", "Ilya", "Olga"};
        Arrays.sort(stringsArray1);
        System.out.println(Arrays.toString(stringsArray1));





    }
}
