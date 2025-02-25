package lecture_9;

public class StringBuilderExample_8 {
    public static void main(String[] args) {
        String str = "Hello";
        for (int i = 0; i < 5; i++) {
            str += " Metallica";
        }
        System.out.println(str);
    }
}
