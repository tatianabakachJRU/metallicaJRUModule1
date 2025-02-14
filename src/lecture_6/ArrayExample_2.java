package lecture_6;

import java.util.Scanner;

public class ArrayExample_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введи длинну массива: ");
        int arrayLength = Integer.parseInt(scanner.next());
        int[] numbersArray;
        if(arrayLength < 10){
            numbersArray = new int[arrayLength];
        } else {
            numbersArray = new int[20];
        }

        for (int i = 0; i < numbersArray.length; i++) {
            System.out.print(numbersArray[i] + " "); // i = 0, i = 1
        }
    }
}
