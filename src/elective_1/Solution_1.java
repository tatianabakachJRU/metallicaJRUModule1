package elective_1;

import java.util.Scanner;

/* 
Второе минимальное число из введенных
*/

public class Solution_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstMin = Integer.MAX_VALUE; // 2млрд
        int secondMin = Integer.MAX_VALUE; // 2млрд

        while (scanner.hasNextInt()){
            int number = scanner.nextInt(); // 2

            if (number < firstMin){ // number = 2 // 2 < 2млрд // -100
                secondMin = firstMin; // secondMin = 2млрд // 2
                firstMin = number; // firstMin = 2 // -100

            } else if(number > firstMin && number < secondMin){
                secondMin = number;
            }
        }
        System.out.println(secondMin);
    }
}