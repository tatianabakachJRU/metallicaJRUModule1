package lecture_11;

public class DragonApp {
    public static void main(String[] args) {
        Dragon dragon = new Dragon("Draco", 1000); // объект
        dragon.fly();
        String name = dragon.getName();
        int age = dragon.getAge();
        System.out.println(name);
        System.out.println(age);
        Dragon kay = new Dragon("Kay", 100); // объект
        Dragon ani = new Dragon("Ani", 10_000); // объект
        kay.fly();
        ani.fly();

    }
}
