package lecture_23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamExample_1 {
    public static void main(String[] args) {
        String fileName = "exampleIO.txt";

        try(FileInputStream inputStream = new FileInputStream(fileName)) {
            int availableBytes = inputStream.available();
            System.out.println("Доступно байт для чтения: " + availableBytes);

            System.out.println("\n======= Чтение по одному байту =======");
            int data;
            while ((data = inputStream.read())!=-1){
                System.out.print(((char) data) + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
