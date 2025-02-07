package lecture_3;

import java.util.Scanner;

public class Example_3L_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = Integer.parseInt(scanner.next());

        if (number == 10) // 100 < 10 ложь
        {
            System.out.println("Число равно 10");
        }


        System.out.println("Конец программы");
    }
}
