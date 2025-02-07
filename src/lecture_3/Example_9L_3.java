package lecture_3;

public class Example_9L_3 {
    public static void main(String[] args) {

        int number = 20;
        String result = number >= 20 ? "Cat" : "Dog";
                                    // true    false
        System.out.println(result);

        int result2 = number > 15 ? ++number : Integer.parseInt("100+" + "2");
        System.out.println(result2);
    }
}
