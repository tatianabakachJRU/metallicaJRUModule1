package lecture_7;

import java.util.Arrays;
import java.util.Random;

public class ArrayExample_3 {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 4;

        Random random = new Random();

        int[][] randomArray = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                randomArray[i][j] = random.nextInt(201)+100;
            }
        }

        System.out.println(Arrays.deepToString(randomArray));
    }
}
