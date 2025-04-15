package lecture_25.localDateTime;

import java.time.LocalDate;

public class LocalDateExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println(today);
        LocalDate localDate = LocalDate.of(2023, 3, 12);
        System.out.println(localDate);

        System.out.println(localDate.getEra());
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfYear());
        System.out.println(localDate.getDayOfWeek());

        LocalDate futureDate = today.plusDays(10);
        LocalDate date = today.minusYears(25);
        System.out.println(futureDate);
        System.out.println(date);
    }
}
