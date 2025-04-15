package lecture_25.localDateTime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZoneDateTimeExample {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("Europe/Paris"));
        System.out.println(zonedDateTime);

        ZonedDateTime parisTime = ZonedDateTime.now(ZoneId.of("Europe/Paris"));
        System.out.println(parisTime);

        ZoneId zone = now.getZone();
        System.out.println(zone);
    }
}
