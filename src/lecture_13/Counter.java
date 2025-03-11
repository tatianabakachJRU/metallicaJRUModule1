package lecture_13;

public class Counter {
    public static final int NUMBER = 10;
    private static int staticCount;
    private int nonStaticCount;

    public Counter() {
        staticCount++;
        nonStaticCount++;
    }

    public static int getStaticCount(){
//        getNonStaticCount();
//        int i = nonStaticCount + 1;
//        Counter counter = new Counter();
//        counter.getNonStaticCount();
//        int nonStaticCount1 = counter.nonStaticCount;
        return staticCount;
    }

    public int getNonStaticCount() {
//        getStaticCount();
//        int i = staticCount + 1;
        return nonStaticCount;
    }
}
