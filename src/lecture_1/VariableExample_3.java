package lecture_1;

public class VariableExample_3 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;

        int result = a++ * b++; // 2 * 3
        // a = 3; b = 4;
        System.out.println(result);
        System.out.println(a);
        System.out.println(b);

        int result2 = ++a * ++b; // 4 * 5
        System.out.println(result2);
        System.out.println(a);
        System.out.println(b);
    }
}
