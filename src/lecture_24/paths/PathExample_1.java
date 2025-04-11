package lecture_24.paths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathExample_1 {
    public static void main(String[] args) {
        Path path = Paths.get("documents/example.txt");
        System.out.println("File name: " + path.getFileName());
        System.out.println("Parent path: " + path.getParent());
        System.out.println("Is Absolute: " + path.isAbsolute());
        System.out.println(path.toAbsolutePath());
    }
}
