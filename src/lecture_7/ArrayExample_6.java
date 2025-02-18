package lecture_7;

import java.util.Scanner;
//     __*__
//     _***_
//     *****


public class ArrayExample_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите высоту треугольника");
        int height = Integer.parseInt(scanner.nextLine());

        char[][] triangle = new char[height][2 * height - 1];

        for (int i = 0; i < height; i++) { // height = triangle.length
            for (int j = 0; j < 2 * height - 1; j++) { // 2 * height - 1 = triangle[i].length
                if (j >= height - i - 1 && j <= height + i - 1) {
                    // j >= 3 - 0 - 1 и j <= 3 + 0 - 1
                    triangle[i][j] = '*';
                } else {
                    triangle[i][j] = ' ';
                }
            }
        }

        for (int i = 0; i < height; i++) {
            System.out.println(triangle[i]);
        }


    }


}
