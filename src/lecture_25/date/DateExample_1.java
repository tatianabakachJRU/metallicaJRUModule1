package lecture_25.date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample_1 {
    public static void main(String[] args) {
        Date current = new Date();
        System.out.println(current);

        Date date = new Date(125, 4, 23, 20, 21, 22);
        System.out.println(date);

        System.out.println(date.getYear());
        System.out.println(date.getTime());
        System.out.println(date.getDay());
        date.setTime(-26688685657644L);
        System.out.println(date);

        SimpleDateFormat formater = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
        String formatDate = formater.format(new Date());
        System.out.println("Date: " + formatDate);


    }
}
