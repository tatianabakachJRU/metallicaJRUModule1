package lecture_2;

import java.util.Scanner;

public class ScannerExample_5 {
    public static void main(String[] args) {
        String str = "10 ab 40 60";
        Scanner scanner = new Scanner(str);
        int a = scanner.nextInt(); // 10
        System.out.println(a);

        int b = scanner.nextInt(); // Exception
        System.out.println(a + b);
    }
}
