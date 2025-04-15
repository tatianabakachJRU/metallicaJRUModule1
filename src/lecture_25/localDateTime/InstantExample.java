package lecture_25.localDateTime;

import java.time.Instant;

public class InstantExample {
    public static void main(String[] args) {
        Instant now = Instant.now();
        System.out.println(now);

        Instant instant = Instant.ofEpochSecond(-197979797L);
        System.out.println(instant);

        long epochSecond = now.getEpochSecond();
        System.out.println(epochSecond);
        int nano = now.getNano();
        System.out.println(nano);

        Instant instant1 = now.plusSeconds(34);
        System.out.println(instant1);
    }
}
