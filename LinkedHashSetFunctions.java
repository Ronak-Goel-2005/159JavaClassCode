import java.util.*;

public class LinkedHashSetFunctions {
    public static void main(String[] args) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();

        // Adding elements to the LinkedHashSet
        set.add(10);
        set.add(20);
        set.add(30);
        System.out.println("LinkedHashSet after additions: " + set);

        // Attempting to add duplicate elements
        boolean added = set.add(20);
        System.out.println("Attempt to add duplicate 20: " + added);
        System.out.println("LinkedHashSet after attempting to add duplicate: " + set);

        // Removing elements from the LinkedHashSet
        set.remove(10);
        System.out.println("LinkedHashSet after removing 10: " + set);

        // Checking for existence of elements
        boolean contains20 = set.contains(20);
        boolean contains10 = set.contains(10);
        System.out.println("LinkedHashSet contains 20: " + contains20);
        System.out.println("LinkedHashSet contains 10: " + contains10);

        // Iterating through the LinkedHashSet
        System.out.print("Elements in LinkedHashSet: ");
        for (Integer num : set) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Getting the size of the LinkedHashSet
        int size = set.size();
        System.out.println("Size of LinkedHashSet: " + size);

        // Clearing the LinkedHashSet
        set.clear();
        System.out.println("LinkedHashSet after clearing: " + set);
    }
}
