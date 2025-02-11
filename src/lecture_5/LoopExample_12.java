package lecture_5;

public class LoopExample_12 {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
            if (i % 2 == 0) { // 2 % 2 == 0
                continue;
            }
            System.out.println();
        }

        System.out.println("*".repeat(15));


        int i = 0;
        while (i <= 20) {
            i++;
            if ((i % 7) == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}

