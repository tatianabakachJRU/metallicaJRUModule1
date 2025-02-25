package lecture_9;

public class StringBuilderExample_10 {
    public static void main(String[] args) {
        long startTime;
        long endTime;

        startTime = System.nanoTime();
        String str = "";
        for (int i = 0; i < 10_000; i++) {
            str += "a";
        }
        endTime = System.nanoTime();
        System.out.println("Время выполнения String: " + (endTime-startTime) + "нс");

        startTime = System.nanoTime();
        StringBuilder strSB = new StringBuilder();
        for (int i = 0; i < 10_000; i++) {
            strSB.append("a");
        }
        endTime = System.nanoTime();
        System.out.println("Время выполнения StringBuilder: " + (endTime-startTime) + "нс");



    }
}
