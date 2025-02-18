package lecture_7;

import java.util.Arrays;

public class ArrayExample_5 {
    public static void main(String[] args) {
        int[][] array1 = {{0, 2}, {3, 4}};
        int[][] array2 = {{1, 2}, {3, 4}};

        System.out.println(Arrays.deepEquals(array1, array2));

        int[][] ints = Arrays.copyOf(array1, array2.length + 2);
        //{{0, 2}, {3, 4}, null, null};
        System.out.println(Arrays.deepToString(ints));

        int[][][] myArray = new int[2][3][4];
        Arrays.fill(myArray[1][1], 1);
        System.out.println(Arrays.deepToString(myArray));
    }
}
