package lecture_16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample_3 {
    public static void main(String[] args) {
        Set<String> mySet = new HashSet<>();
        mySet.add("apple");
        mySet.add("banana");
        mySet.add("cherry");

        Iterator<String> iterator = mySet.iterator();
        Set<String> newSet = new HashSet<>();

        while (iterator.hasNext()) {
            String next = iterator.next();
            if (next.equals("banana")) {
                newSet.add("orange");
            } else {
                newSet.add(next);
            }
        }
        mySet.clear();
        mySet.addAll(newSet);
        System.out.println(mySet);
    }
}
