package lecture_15;

public class WrappersExample_4 {
    public static void main(String[] args) {
        Character symbol = 'a';
        Character whitespace = ' ';

        System.out.println(Character.isLetter(symbol));
        System.out.println(Character.isDigit(symbol));
        System.out.println(Character.isWhitespace(symbol));
        System.out.println(Character.isWhitespace(whitespace));
        System.out.println(Character.isLowerCase(symbol));
        System.out.println(Character.isUpperCase(symbol));
        System.out.println(Character.toUpperCase(symbol));


    }
}
