package lecture_1;

public class VariableExample_5 {
    public static void main(String[] args) {
        String str = "1";
        int number = Integer.parseInt(str);
        System.out.println(number + 5);
        System.out.println(str + 5.344);

        int numberForString = 10;
        String string = String.valueOf(numberForString);
        System.out.println(numberForString * 5);
        System.out.println(string + 5);
    }
}

