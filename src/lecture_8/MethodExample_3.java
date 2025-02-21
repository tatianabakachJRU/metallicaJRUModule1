package lecture_8;

import java.util.Arrays;

public class MethodExample_3 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 3};
        System.out.println(Arrays.toString(numbers));
        printString(numbers);
    }

    public static void printString(int[] array) {
        int[] myArray = array;
        myArray[0] = 1;
        array[1] = 2;
        System.out.println(Arrays.toString(myArray));
        System.out.println(Arrays.toString(array));
    }
}
