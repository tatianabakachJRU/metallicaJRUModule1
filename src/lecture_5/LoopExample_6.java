package lecture_5;

import java.util.Scanner;

public class LoopExample_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your name?");
        String name = scanner.nextLine();
        String menuItem;
        do {
            System.out.println("""
                    *********************
                    What do you want to do?
                    1. Say Hello
                    2. Say Bye
                    3. Exit
                    """);
            menuItem = scanner.nextLine();
            if (menuItem.equals("1")) {
                System.out.println("Hello " + name);
            } else if (menuItem.equals("2")) {
                System.out.println("Bye " + name);
            }

        } while (menuItem.equals("1") || menuItem.equals("2"));
    }
}

