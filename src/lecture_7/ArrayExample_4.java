package lecture_7;

import java.util.Arrays;

public class ArrayExample_4 {
    public static void main(String[] args) {
        int[][][] myArray =
                {
                        {
                                {1, 2, 3},
                                {4, 5}
                        },

                        {
                                {1, 2, 0},
                                {0, 0, 0},

                        }

                };
        System.out.println(Arrays.deepToString(myArray));

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                for (int k = 0; k < myArray[i][j].length; k++) {
                    System.out.print(myArray[i][j][k] + " ");
                }
                System.out.println();
            }
        }
    }
}
