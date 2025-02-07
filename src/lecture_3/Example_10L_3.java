package lecture_3;

public class Example_10L_3 {
    public static void main(String[] args) {
        String text = "Привет"; // ссылка(адрес первой ячейки памяти объект) -> объект
        String message = text; // ссылка
        System.out.println(text == message); // ссылки одинаковые -> true
        System.out.println("Equals: " + text.equals( message));

        String newText = new String("привет"); // другой объект
        // в newText будет находится ссылка на другой объект
        System.out.println(message == newText); // ссылки разные -> false
        System.out.println("Equals: " + message.equalsIgnoreCase(newText));
    }
}
