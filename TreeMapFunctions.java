import java.util.*;

public class TreeMapFunctions {
    public static void main(String[] args) {
        // Create a TreeMap
        TreeMap<String, Integer> map = new TreeMap<>();

        // Insert key-value pairs
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Orange", 3);

        // Retrieve a value by key
        System.out.println("Value for 'Banana': " + map.get("Banana"));

        // Check if a key exists
        System.out.println("Contains key 'Apple': " + map.containsKey("Apple"));

        // Remove a key-value pair
        map.remove("Orange");
        System.out.println("After removing 'Orange': " + map);

        // Iterate over keys
        System.out.println("Keys:");
        for (String key : map.keySet()) {
            System.out.println(key + ": " + map.get(key));
        }

        // Iterate over values
        System.out.println("Values:");
        for (Integer value : map.values()) {
            System.out.println(value);
        }

        // Iterate over key-value pairs
        System.out.println("Key-Value Pairs:");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Using Iterator
        System.out.println("Using Iterator:");
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
