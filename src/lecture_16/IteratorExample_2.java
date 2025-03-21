package lecture_16;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorExample_2 {
    public static void main(String[] args) {
        List<String> dogs = new ArrayList<>();
        dogs.add("Rex");
        dogs.add("Bobik");
        dogs.add("Barny");
        dogs.add("Barny");

        Iterator<String> iterator = dogs.iterator();

        while (iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }

        iterator = dogs.iterator();

        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("Bobik")) {
                dogs.remove("Bobik");
            }
        }
        System.out.println(dogs);
    }
}
