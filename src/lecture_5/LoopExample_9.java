package lecture_5;

import java.time.LocalDateTime;

public class LoopExample_9 {
    public static void main(String[] args) {
        int number = 5;
        for (;number < 10;){
            System.out.println(LocalDateTime.now());
            number++;
        }
    }
}
