package lecture_8;

public class MethodExample_1 {
    public static void main(String[] args) {
        System.out.println("Meow");
        System.out.println("Meow");
        System.out.println("Meow");
        System.out.println("Meow");
        System.out.println("Meow");


        printAnimalSound("Meow", 5);


        System.out.println("Meooooow");
        System.out.println("Meooooow");
        System.out.println("Meooooow");
        System.out.println("Meooooow");
        System.out.println("Meooooow");

        System.out.println("Bark");
        System.out.println("Bark");
        System.out.println("Bark");
        System.out.println("Bark");
        System.out.println("Bark");
        System.out.println("Bark");

        System.out.println("Wow");
        System.out.println("Wow");
        System.out.println("Wow");
        System.out.println("Wow");
        System.out.println("Wow");

        printAnimalSound("Wow", 5);
    }

    public static void printAnimalSound(String sound, int count) {
        System.out.println("*".repeat(15));
        for (int i = 0; i < count; i++) {
            System.out.println(sound);
        }
        System.out.println("*".repeat(15));
    }
}
