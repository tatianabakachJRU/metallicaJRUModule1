package lecture_25.calendar;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarExample_1 {
    public static void main(String[] args) {
        Calendar calendar1 = Calendar.getInstance();
        Calendar calendar2 = new GregorianCalendar();
        System.out.println(calendar1);
        System.out.println(calendar2);

        System.out.println(calendar1.get(Calendar.YEAR));
        System.out.println(calendar1.get(Calendar.MONTH));
        System.out.println(calendar1.get(Calendar.DAY_OF_WEEK));
        calendar1.set(Calendar.YEAR, 2021);
        System.out.println(calendar1.get(Calendar.YEAR));
    }
}
