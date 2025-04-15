package lecture_25.localDateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Locale;

public class FormaterExample {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2023, 1, 14);
//        Locale locale = new Locale.Builder().setLanguage("ru").build();
//        DateTimeFormatter formatter = new DateTimeFormatterBuilder()
//                .appendPattern("EEE, d, MMMM")
//                .toFormatter(locale);
//        String format = localDate.format(formatter);
//        System.out.println(format);

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("yyyy:MMMM:dd:EEEE");
        String format1 = localDate.format(formatter1);
        System.out.println(format1);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-yy", Locale.US);

        String stringDate = "23-February-19";
        LocalDate parse = LocalDate.parse(stringDate, formatter);
        System.out.println(parse);

    }
}
