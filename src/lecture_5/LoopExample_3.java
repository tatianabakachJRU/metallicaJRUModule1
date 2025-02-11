package lecture_5;

public class LoopExample_3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 16;

        while (++a < --b){ // 1 итерация 11 < 15, 2 итерация 12 < 14
            System.out.println("Это цикл");
        }

    }
}
