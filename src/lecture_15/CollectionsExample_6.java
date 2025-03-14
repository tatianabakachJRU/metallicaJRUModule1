package lecture_15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollectionsExample_6 {
    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();

        strings.add("Hello");
        strings.add("true");
        strings.add(1, "World");

        System.out.println(strings);

        strings.remove(1);
        strings.remove("Hello");
        System.out.println(strings);

        String string = strings.get(0);
        System.out.println(string);

        strings.set(0, "Cat");
        System.out.println(strings);

        System.out.println(strings.size());
        System.out.println(strings.isEmpty());

        strings.add("Apple");
        strings.add("Dog");

        for (String s : strings) {
            System.out.println(s);
            if(s.equals("Cat")){
                strings.remove(s);
            }
        }
    }
}
