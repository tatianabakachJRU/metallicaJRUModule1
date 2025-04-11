package lecture_24.decorators;

import java.io.*;

public class BufferedDataStreamExample {
    public static void main(String[] args) {
        String filePath = "number.txt";
        writeInToFile(filePath, 123);
        readFromFile(filePath);

    }
    private static void writeInToFile(String path, int number){
        try(DataOutputStream dataOutputStream = new DataOutputStream(
                new BufferedOutputStream(
                        new FileOutputStream(path)))) {
            dataOutputStream.writeInt(number);
            System.out.println("Integer write to file: " + number);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    private static void readFromFile(String path){
        try(FileInputStream fileInputStream = new FileInputStream(path);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream)){
            int number = dataInputStream.readInt() + 5;
            System.out.println("Integer read from file: " + number);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
