package lecture_3;

import java.util.Scanner;

public class Example_4L_3 {
    public static void main(String[] args) {
        int temperature = 9;
        if (temperature > 20)
            System.out.println("надеть рубашку");
        else if (temperature > 10)
            System.out.println("надеть свитер");
        else if (temperature > 0)
            System.out.println("надеть плащ");
        else // тут температура меньше 0
            System.out.println("надеть пальто");
    }
}

