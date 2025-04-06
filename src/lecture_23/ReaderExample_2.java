package lecture_23;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderExample_2 {
    public static void main(String[] args) {
        String fileName = "exampleIO.txt";

        try(FileReader fileReader = new FileReader(fileName)) {
            System.out.println("\n======= Чтение по одному символу =======");
            int data;
            while ((data = fileReader.read())!=-1){
                System.out.print(((char) data) + " ");
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
