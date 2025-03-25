package lecture_19.enums;

import java.util.Arrays;

public class EnumApp {
    public static void main(String[] args) {
        Day day = Day.MONDAY;
        System.out.println(day);

        if(day == Day.SATURDAY || day == Day.SANDAY){
            System.out.println("Ура выходной. Поработаю немножко");
        } else {
            System.out.println("Вообще не буду работать");
        }
        Day[] values = Day.values();
        System.out.println(Arrays.toString(values));
        for (Day value : values) {
            System.out.println(value);
        }
        System.out.println(Day.MONDAY.ordinal());
        System.out.println(Day.FRIDAY.ordinal());

        String string = Day.WEDNESDAY.toString();

    }
}
