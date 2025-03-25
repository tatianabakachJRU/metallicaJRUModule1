package lecture_19.enums;

import java.util.Scanner;

public class EnumValueOfExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите день недели:");
        String input = scanner.nextLine().toUpperCase();

        Day day = Day.valueOf(input);
        System.out.println("Вы выбрали: " + day);


    }
}
