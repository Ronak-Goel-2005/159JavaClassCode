import java.util.*;

public class TreeSetFunctions {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        // Adding elements to the TreeSet
        set.add(30);
        set.add(10);
        set.add(20);
        System.out.println("TreeSet after additions (sorted): " + set);

        // Attempting to add duplicate elements
        boolean added = set.add(20);
        System.out.println("Attempt to add duplicate 20: " + added);
        System.out.println("TreeSet after attempting to add duplicate: " + set);

        // Removing elements from the TreeSet
        set.remove(10);
        System.out.println("TreeSet after removing 10: " + set);
        set.remove(40); // Attempting to remove a non-existent element
        System.out.println("TreeSet after attempting to remove non-existent 40: " + set);

        // Checking for existence of elements
        boolean contains20 = set.contains(20);
        boolean contains10 = set.contains(10);
        System.out.println("TreeSet contains 20: " + contains20);
        System.out.println("TreeSet contains 10: " + contains10);
        boolean contains40 = set.contains(40);
        System.out.println("TreeSet contains 40: " + contains40);

        // Iterating through the TreeSet
        System.out.print("Elements in TreeSet: ");
        for (Integer num : set) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Getting the size of the TreeSet
        int size = set.size();
        System.out.println("Size of TreeSet: " + size);
        
        // Clearing the TreeSet
        set.clear();
    }
}
