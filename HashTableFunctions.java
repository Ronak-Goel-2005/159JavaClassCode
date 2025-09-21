import java.util.*;

public class HashTableFunctions {
    public static void main(String[] args) {
        Hashtable<String, Integer> table = new Hashtable<>();

        // Insert key-value pairs
        table.put("Apple", 1);
        table.put("Banana", 2);
        table.put("Orange", 3);
        System.out.println("Hashtable: " + table);

        // Insert a duplicate key with a new value
        table.put("Banana", 20);
        System.out.println("After updating 'Banana': " + table);

        // Insert a null key (will throw NullPointerException)
        try {
            table.put(null, 4);
        } catch (NullPointerException e) {
            System.out.println("Cannot insert null key in Hashtable.");
        }

        // Insert a null value (will throw NullPointerException)
        try {
            table.put("Grapes", null);
        } catch (NullPointerException e) {
            System.out.println("Cannot insert null value in Hashtable.");
        }

        // Insert by putting if absent
        table.putIfAbsent("Mango", 5);
        System.out.println("After putIfAbsent 'Mango': " + table);
        table.putIfAbsent("Apple", 10); // Will not update as 'Apple' exists
        System.out.println("After putIfAbsent 'Apple': " + table);

        // Retrieve a value by key
        System.out.println("Value for 'Banana': " + table.get("Banana"));

        // Check if a key exists
        System.out.println("Contains key 'Apple': " + table.containsKey("Apple"));

        // Remove a key-value pair
        table.remove("Orange");
        System.out.println("After removing 'Orange': " + table);

        // Iterate over keys
        System.out.println("Keys:");
        for (String key : table.keySet()) {
            System.out.println(key + ": " + table.get(key));
        }

        // Iterate over values
        System.out.println("Values:");
        for (Integer value : table.values()) {
            System.out.println(value);
        }

        // Iterate over key-value pairs
        System.out.println("Key-Value Pairs:");
        for (Map.Entry<String, Integer> entry : table.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        // Using Iterator
        System.out.println("Using Iterator:");
        Iterator<Map.Entry<String, Integer>> iterator = table.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
