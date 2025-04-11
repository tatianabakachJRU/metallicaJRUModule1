package lecture_24.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NIOExample_1 {
    public static void main(String[] args) {
        Path sourcePath = Path.of("fileNIO_1.txt");
        Path destPath = Path.of("fileNIO_2.txt");

        try(FileChannel sourceChanel =
                    FileChannel.open(sourcePath, StandardOpenOption.READ);
            FileChannel destChanel =
                    FileChannel.open(destPath,
                    StandardOpenOption.CREATE, StandardOpenOption.WRITE)) {

            ByteBuffer buffer = ByteBuffer.allocate(1024);
            while (sourceChanel.read(buffer) > 0){
                buffer.flip();
                destChanel.write(buffer);
                buffer.clear();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
