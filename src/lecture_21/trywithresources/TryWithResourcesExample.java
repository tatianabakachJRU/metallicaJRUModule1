package lecture_21.trywithresources;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TryWithResourcesExample {
    public static void main(String[] args) {
        try(Scanner scanner = new Scanner(new File("text.txt"));
            Scanner scanner1 = new Scanner(System.in)){
           while (scanner.hasNextLine()){
               String string = scanner.nextLine();
               System.out.println(string);
           }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
