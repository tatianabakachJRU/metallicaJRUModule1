package lecture_7;

import java.util.Arrays;

public class ArrayExample_1 {
    public static void main(String[] args) {
        int[][] myArray =
                {
                        {1, 2, 3}, // [0][0], [0][1], [0][2]
                        {4, 5, 6}, // [1][0], [1][1], [1][2]
                        {7, 8, 9}  // [2][0], [2][1], [2][2]
                };

        int[][] numberArray = new int[3][3];
        numberArray[0][0] = 1;
        numberArray[1][1] = 10;
        numberArray[2][2] = 100;

        numberArray[1][2] = 100;
        System.out.println("Hello");
        numberArray[1][2] = 10;

        for (int i = 0; i < numberArray.length; i++) {
            for (int j = 0; j < numberArray[i].length; j++) {
                System.out.print(numberArray[i][j] + " ");
            }
            System.out.println();

        }
        System.out.println("8".repeat(20));

        System.out.println(Arrays.deepToString(myArray));





    }
}
