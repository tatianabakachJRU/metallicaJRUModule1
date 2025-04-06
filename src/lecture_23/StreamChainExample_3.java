package lecture_23;

import java.io.*;

public class StreamChainExample_3 {
    public static void main(String[] args) {
        String inputFile = "input.txt";
        String outputFile = "output.txt";

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(outputFile))){

            String line;
            while ((line = bufferedReader.readLine()) != null){
                String processedLine = line.toUpperCase();

                bufferedWriter.write(processedLine);
                bufferedWriter.newLine();
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
