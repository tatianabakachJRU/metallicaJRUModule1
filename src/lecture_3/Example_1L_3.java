package lecture_3;

import java.util.Scanner;

public class Example_1L_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        int number = Integer.parseInt(scanner.next());
        String string = scanner.next(); // Enter
        int number2 = 10;
        if (number < number2)
        {
            System.out.println("Число меньше 10");
            System.out.println(string);
        } else {
            System.out.println("Число больше 10");
        }
    }
}
