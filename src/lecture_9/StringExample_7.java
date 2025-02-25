package lecture_9;

public class StringExample_7 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str4 = "Hello";
        String str2 = new String("Hello");
        String str3 = "Metallica";

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str4));
        System.out.println(str1.equals(str3));

        System.out.println("*".repeat(15));

        String str10 = "Apple";
        String str20 = "Banana";

        System.out.println(str10.compareTo(str20));
        System.out.println(str20.compareTo(str10));
        System.out.println(str10.compareTo("Apple"));




    }
}
