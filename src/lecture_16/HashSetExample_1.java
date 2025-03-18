package lecture_16;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetExample_1 {
    public static void main(String[] args) {
        Set<String> fruits = new TreeSet<>();

        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Melon");
        fruits.add("Orange");
        fruits.add("Banana");

        System.out.println("Fruits HashSet: " + fruits);

        if(fruits.contains("Apple")){
            System.out.println("Apple is in this Set");
        } else {
            System.out.println("Apple isn't in this Set");
        }

        fruits.remove("Orange");
        System.out.println("After removing Orange: " + fruits);

        System.out.println("Total number of fruits: " + fruits.size());

        fruits.clear();
        System.out.println("Set after clear: " + fruits);


    }
}
