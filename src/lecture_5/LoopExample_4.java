package lecture_5;

import java.util.Scanner;

public class LoopExample_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What's your" +
                " name?");
        String name = scanner.nextLine();
        int number = 5;
        while (number < 4) { // false
            System.out.println("""
                    *********************
                    What do you want to do?
                    1. Say Hello
                    2. Say Bye
                    3. Exit
                    """);
            String menuItem = scanner.nextLine();
            if (menuItem.equals("1")) {
                System.out.println("Hello " + name);
            } else if (menuItem.equals("2")) {
                System.out.println("Bye " + name);
            } else if(menuItem.equals("3")){
                break;
            }
            System.out.println("Bye-bye");

        }

        System.out.println("Hello!!!!");
    }
}
