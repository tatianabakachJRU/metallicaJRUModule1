package lecture_19.switchs;

import java.util.Scanner;

public class SwitchExample_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите операцию от 1 до 4");
        int operation = Integer.parseInt(scanner.nextLine());

        switch (operation){
            case 1, 2:
            //case 2:
            case 3:
                System.out.println("Вы выбрали операцию от 1 до 3");
                break;
            case 4:
                System.out.println("Вы выбрали операцию 4");
                break;
            default:
                System.out.println("Вы ввели неверное значение");
                break;
        }
    }
}
