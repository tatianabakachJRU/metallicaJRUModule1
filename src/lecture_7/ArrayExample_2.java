package lecture_7;

import java.util.Arrays;

public class ArrayExample_2 {
    public static void main(String[] args) {
        int[][] matrix = new int[3][];

        matrix[0] = new int[]{1, 2, 3, 4, 5, 6};
        matrix[1] = new int[3];
        matrix[2] = new int[]{1, 3, 7, 9};

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("*".repeat(15));

        System.out.println(Arrays.deepToString(matrix));
    }
}
