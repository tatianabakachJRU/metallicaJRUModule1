package lecture_9;

import java.util.Arrays;

public class StringExample_6 {
    public static void main(String[] args) {
        String text = "This is the text";
        String emptyString = "";
        String blankString = "              ";

        System.out.println(text.length());
        System.out.println("*".repeat(15));
        System.out.println(text.isEmpty());
        System.out.println(emptyString.isEmpty());
        System.out.println(blankString.isEmpty());
        System.out.println("*".repeat(15));
        System.out.println(text.isBlank());
        System.out.println(emptyString.isBlank());
        System.out.println(blankString.isBlank());
        System.out.println("*".repeat(15));
        System.out.println(text.charAt(3));
        char[] charArray = text.toCharArray();
        System.out.println(Arrays.toString(charArray));
        System.out.println(Arrays.toString(text.split(" ")));

        int index = text.indexOf("is", 3);
        System.out.println(index);

        String substring = text.substring(2, 9);
        System.out.println(substring);


    }
}
