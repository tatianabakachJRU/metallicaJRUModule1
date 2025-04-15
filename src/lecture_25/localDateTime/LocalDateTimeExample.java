package lecture_25.localDateTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeExample {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);
        LocalDateTime localDateTime1 = LocalDateTime.of(LocalDate.now(), LocalTime.now());
        LocalDateTime localDateTime2 = LocalDateTime.of(2023, 2, 21, 14, 30);

        System.out.println(localDateTime1.getYear());
        System.out.println(localDateTime1.getHour());
    }
}
