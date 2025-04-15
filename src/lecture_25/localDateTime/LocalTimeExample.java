package lecture_25.localDateTime;

import java.time.LocalTime;

public class LocalTimeExample {
    public static void main(String[] args) {
        LocalTime now = LocalTime.now();
        System.out.println(now);

        LocalTime localTime = LocalTime.of(14, 30);
        System.out.println(localTime);
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());
        System.out.println(now.getNano());

        System.out.println(now.plusHours(2));
        System.out.println(now.minusMinutes(5));
    }
}
