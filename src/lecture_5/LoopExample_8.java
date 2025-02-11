package lecture_5;

public class LoopExample_8 {
    public static void main(String[] args) {
        for (int a = 1, b = 4; a < b; a++, b--)
        {
            // 1 < 4, 2 < 3, 3 < 2-false
            System.out.println("a=" + a);
            System.out.println("b=" + b);
            // изменение переменных счетчиков a=2 b=3
            //                                a=3 b=2
        }

    }
}
