package lecture_24.directoryStream;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class DirectoryStreamExample {
    public static void main(String[] args) {
        Path path = Paths.get("/Users/tatianabakach/Documents/javarush/theKillers/metallicaJRUModule1");

        try(DirectoryStream<Path> pathDirectoryStream =
                    Files.newDirectoryStream(path, "*.txt")) {
            for (Path path1 : pathDirectoryStream) {
                System.out.println(path1.getFileName());
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
