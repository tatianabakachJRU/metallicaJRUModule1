package lecture_12.cow;

public class CowApp {
    public static void main(String[] args) {
        Cow bessi = new Cow("Bessi", 3);
        Cow bessiCopy = bessi;
        Cow newBessi = new Cow("Bessi", 3);

        System.out.println(bessi.equals(bessiCopy));
        System.out.println(bessi.equals(null));
        System.out.println(bessi.equals(newBessi));

        System.out.println(bessi);
        System.out.println(bessi.printCow());

    }
}
