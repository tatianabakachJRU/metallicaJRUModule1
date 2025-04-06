package lecture_23;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayISOSExample {
    public static void main(String[] args) {
        try(ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream()) {
            String data = "Hello ByteArrayOutputStream and ByteArrayInputStream";
            byteArrayOutputStream.write(data.getBytes());
            byte[] byteArray = byteArrayOutputStream.toByteArray();

            try(ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArray))
            {
                int dataByte;
                while ((dataByte = byteArrayInputStream.read()) != -1){
                    System.out.print(((char) dataByte) + " ");
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }




        }
}
