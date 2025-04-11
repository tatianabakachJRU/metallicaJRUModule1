package lecture_24.nioInputStream;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;

public class NIOInputStreamExample {
    public static void main(String[] args) {
        Path path = Path.of("example.txt");
        try(InputStream inputStream = Files.newInputStream(path)) {
            int data;
            while ((data = inputStream.read()) != -1){
                System.out.print(((char) data) + " ") ;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
