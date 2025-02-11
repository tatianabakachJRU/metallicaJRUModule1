package lecture_5;

public class LoopExample_13 {
    public static void main(String[] args) {
        System.out.println("Before return");

        for (int i = 0; i < 5; i++)
        {
            System.out.println(i); // 3
            if (i == 3){
                return;
            }
        }

        System.out.println("After return");
    }
}
