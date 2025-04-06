package lecture_23;

import java.io.*;

public class InputStreamReaderExample_4 {
    public static void main(String[] args) {
        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("outputISR.txt")))
        {
            System.out.println("Введите текст или exit для выхода");
            String line;
            while (!(line = bufferedReader.readLine()).equalsIgnoreCase("exit")){
                String processedLine = line.toUpperCase();

                bufferedWriter.write(processedLine);
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
