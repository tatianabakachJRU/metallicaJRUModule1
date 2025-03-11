package lecture_13;

public class StaticExample_1 {
    static {
        System.out.println("Static block");
    }

    {
        System.out.println("NonStatic block");
    }

    public static int staticField = 10;

    public StaticExample_1() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        StaticExample_1 staticExample1 = new StaticExample_1();
        StaticExample_1 staticExample2 = new StaticExample_1();
    }

}
