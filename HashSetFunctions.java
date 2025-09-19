import java.util.*;

public class HashSetFunctions {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();

        // Adding elements to the HashSet
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("HashSet after additions: " + set);

        // Attempting to add duplicate elements
        boolean added = set.add(20);
        System.out.println("Attempt to add duplicate 20: " + added);
        System.out.println("HashSet after attempting to add duplicate: " + set);

        // Removing elements from the HashSet
        set.remove(10);
        System.out.println("HashSet after removing 10: " + set);

        // Checking for existence of elements
        boolean contains20 = set.contains(20);
        boolean contains10 = set.contains(10);
        System.out.println("HashSet contains 20: " + contains20);
        System.out.println("HashSet contains 10: " + contains10);

        // Iterating through the HashSet
        System.out.print("Elements in HashSet: ");
        for (Integer num : set) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Getting the size of the HashSet
        int size = set.size();
        System.out.println("Size of HashSet: " + size);

        // Clearing the HashSet
        set.clear();
        System.out.println("HashSet after clearing: " + set);
    }
}
