import java.util.*;

public class LinkedListFunctions {
    public static void main(String[] args) {
        LinkedList<String> list = new java.util.LinkedList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.addFirst("Mango");
        list.addLast("Orange");
        System.out.println("Original List: " + list);

        // Size of the LinkedList
        int size = list.size();
        System.out.println("Size: " + size);
        
        // Different ways to print a LinkedList
        System.out.println(list);

        for(String item : list) {
            System.out.print(item + " ");
        }
        System.out.println();

        Iterator<String> iterator = list.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Get element at a specific index
        String element = list.get(1);
        System.out.println("Element at index 1: " + element);
        String firstElement = list.getFirst();
        System.out.println("First Element: " + firstElement);
        String lastElement = list.getLast();
        System.out.println("Last Element: " + lastElement);

        // Update element at a specific index
        list.set(1, "Blueberry");

        // Remove element
        list.remove("Banana");
        System.out.println("List after removing 'Banana': " + list);

        // Check if the list contains an element
        boolean containsCherry = list.contains("Cherry");
        System.out.println("Does the list contain 'Cherry'? " + containsCherry);

        // Sort the list
        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        // Search for an element
        int index = Collections.binarySearch(list, "Cherry");
        System.out.println("Index of 'Cherry': " + index);

        // Reverse the list
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        // Clear the list
        list.clear();
        System.out.println("List after clearing: " + list);
    }
}
