package lecture_6;

import java.util.Arrays;

public class ArrayExample_3 {
    public static void main(String[] args) {
        String[] strArray = new String[10]; // new Cat[3]
        strArray[0] = "Привет";
        System.out.println(strArray[0]);
        System.out.println(strArray[1]);

        System.out.println(Arrays.toString(strArray));

        String[] nameArray = {"Tania", "Vania", "Petr"};
        System.out.println(nameArray.length);
        nameArray[3] = "Vlad"; // ArrayIndexOutOfBoundsException
    }
}
