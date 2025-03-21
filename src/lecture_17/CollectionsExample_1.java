package lecture_17;

import java.util.*;

public class CollectionsExample_1 {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        Collections.addAll(strings, "Apple", "Banana", "Cherry");

        System.out.println(strings);

        ArrayList<String> list = new ArrayList<>(Arrays.asList("A", "B", "C"));
        System.out.println(list);
        Collections.fill(list, "X");
        System.out.println(list);

        Set<Integer> numbers = new HashSet<>(Arrays.asList(3, 1, -100, 5, 2045, - 18));
        Integer min = Collections.min(numbers);
        System.out.println("Minimum: " + min);
        Integer max = Collections.max(numbers);
        System.out.println("Maximum: " + max);

        ArrayList<String> strings1 = new ArrayList<>(Arrays.asList("a", "b", "c"));
        ArrayList<String> strings2 = new ArrayList<>(Arrays.asList("1", "2", "4"));
        System.out.println(strings2);
        Collections.copy(strings2, strings1);
        System.out.println(strings2);




    }
}
