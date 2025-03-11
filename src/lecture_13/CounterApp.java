package lecture_13;

public class CounterApp {
    public static void main(String[] args) {
        Counter objectCounter1 = new Counter();
        Counter counter2 = new Counter();
        Counter counter3 = new Counter();
        Counter counter4 = new Counter();

        int max = Math.max(2, 3);
        System.out.println(max);

        System.out.println("Count: " + Counter.getStaticCount());
        //System.out.println("Count: " + Counter.getNonStaticCount());
        System.out.println("Count: " + objectCounter1.getStaticCount());
        System.out.println("NonStaticCount: " + objectCounter1.getNonStaticCount());
    }
}
