package lecture_17;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 100);
        map.put("Cherry", 100);
        map.put("Orange", 100);
        map.put("Orange", 1000); // дубликатов ключей не допускается

        System.out.println("Value for Banana: " + map.get("Banana"));

        if(map.containsKey("Apple")){
            System.out.println("Apple is on the map");
        }

        map.remove("Cherry");

        for (String key : map.keySet()) {
            System.out.println("key: " + key);
        }

        for (Integer value : map.values()) {
            System.out.println("value: " + value);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println("Map size: " + map.size());


    }
}
