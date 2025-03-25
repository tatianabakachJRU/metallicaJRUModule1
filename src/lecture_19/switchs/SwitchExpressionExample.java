package lecture_19.switchs;

public class SwitchExpressionExample {
    public static void main(String[] args) {
        String fruit = "Banana";

        String color =
                switch (fruit){
            case "Apple", "Banana" -> "Green";
            case "Cherry" -> "Red";
            case "Mellon" -> "Yellow";
            default -> "white";
        };

        System.out.println("The color of fruit is " + color);

        Integer number = 2;

        switch (number){
            case 1 -> System.out.println("One");
            case 2 ->
            {
                System.out.println("Two");
                number = number + 2;
                System.out.println(number);
            }
            case null -> System.out.println("null");
            default -> System.out.println("unknown");
        }
    }
}
