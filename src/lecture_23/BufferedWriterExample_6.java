package lecture_23;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample_6 {
    public static void main(String[] args) {
        String outputFle = "outputBW.txt";
        int bufferSize = 16;

        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFle), bufferSize)){
            bufferedWriter.write("Hello, Buffered Writer!!!");
            bufferedWriter.newLine();
            bufferedWriter.write("This line is written using Buffered Writer!!!");
            bufferedWriter.newLine();
            bufferedWriter.write(String.format("This number is: %d", 42));
            //bufferedWriter.flush();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
