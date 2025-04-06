package lecture_23;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample_5 {
    public static void main(String[] args) {
        try(FileOutputStream fos = new FileOutputStream("outputOS.txt")) {

        String data = "My cat like milk";
        fos.write(data.getBytes());

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
