package lecture_17.cats;

import java.util.Map;
import java.util.TreeMap;

public class CatsApp {
    public static void main(String[] args) {
        TreeMap<Cat, String> catMapByName = new TreeMap<>(new NameComparator());

        catMapByName.put(new Cat("Whiskers", 3), "First cat");
        catMapByName.put(new Cat("Angel", 1), "Second cat");
        catMapByName.put(new Cat("Luna", 14), "Third cat");

        System.out.println("Котики отсортированы по имени");
        for (Cat cat : catMapByName.keySet()) {
            System.out.println(cat);
        }

        TreeMap<Cat, String> catMapByAge = new TreeMap<>(new AgeComparator());

        catMapByAge.put(new Cat("Whiskers", 3), "First cat");
        catMapByAge.put(new Cat("Angel", 1), "Second cat");
        catMapByAge.put(new Cat("Luna", 14), "Third cat");

        System.out.println("Котики отсортированы по возрасту");
        for (Map.Entry<Cat, String> entry : catMapByAge.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
