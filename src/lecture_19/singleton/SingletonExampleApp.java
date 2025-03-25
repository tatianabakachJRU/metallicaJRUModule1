package lecture_19.singleton;

public class SingletonExampleApp {
    public static void main(String[] args) {
        //SingletonExample singletonExample = new SingletonExample();
        SingletonExample instance = SingletonExample.getInstance();
    }
}
