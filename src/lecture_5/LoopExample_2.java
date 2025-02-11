package lecture_5;

public class LoopExample_2 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        while (a < b){ // 2 итерация 11 < 19, 3 итерация 12 < 18
            System.out.println("a меньше b");
            a++;
            b--;
        }
    }
}
