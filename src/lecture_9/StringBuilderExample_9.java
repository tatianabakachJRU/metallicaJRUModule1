package lecture_9;

public class StringBuilderExample_9 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        for (int i = 0; i < 5; i++) {
            str.append(" Metallica");
        }
        System.out.println(str);


    }
}
