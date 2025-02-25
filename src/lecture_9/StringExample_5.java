package lecture_9;

public class StringExample_5 {
    public static void main(String[] args) {
        String str1 = "Hello"; // сразу добавляется в StringPool


        String str2 = "Hello"; // достает ссылку из StringPool
        // одно Hello

        String str3 = new String("Hello").intern();

        System.out.println(str1 == str2);
        System.out.println(str1 == str3);

    }
}
