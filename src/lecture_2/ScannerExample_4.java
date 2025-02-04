package lecture_2;

import java.util.Scanner;

public class ScannerExample_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        String number = scanner.nextLine(); // 25
        System.out.println("Number: " + number + 25);
    }
}
