package lecture_24.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FilesExample {
    public static void main(String[] args) {
        Path sourcePath = Path.of("example.txt");
        Path copyPath = Paths.get("copy_example.txt");
        Path movedPath = Paths.get("moved_example.txt");
        Path destPath = Paths.get("dest_example.txt");
        Path dirPath = Paths.get("newDir");

        try{
            if (Files.exists(sourcePath)) {
                List<String> lines = Files.readAllLines(sourcePath);
                System.out.println("File contents: ");
                for (String line : lines) {
                    System.out.println(line);
                }
                Files.write(destPath, lines);
                System.out.println("Data is written to file");
            } else {
                System.out.println("File example.txt is not exist");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try{
            Files.copy(sourcePath, copyPath);
            System.out.println("File copied to copy_example.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try{
            Files.move(copyPath, movedPath);
            System.out.println("File moved to moved_example.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try{
            Files.delete(movedPath);
            System.out.println("Delete");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try{
            Files.createDirectory(dirPath);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
