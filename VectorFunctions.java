import java.util.*;

public class VectorFunctions {
    public static void main(String[] args) {
        Vector<String> vector = new Vector<>();
        System.out.println("Initial capacity: " + vector.capacity());

        vector.add("Apple");
        vector.add("Banana");
        vector.add("Cherry");
        vector.add(0, "Mango");
        vector.add(vector.size(), "Orange");
        System.out.println("Original Vector: " + vector);

        // Size of the Vector
        int size = vector.size();
        System.out.println("Size: " + size);
        
        // Different ways to print a Vector
        System.out.println(vector);

        for(String item : vector) {
            System.out.print(item + " ");
        }
        System.out.println();

        Iterator<String> iterator = vector.iterator();
        while(iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();

        // Get element at a specific index
        String element = vector.get(1);
        System.out.println("Element at index 1: " + element);
        String firstElement = vector.firstElement();
        System.out.println("First Element: " + firstElement);
        String lastElement = vector.lastElement();
        System.out.println("Last Element: " + lastElement);

        // Update element at a specific index
        vector.set(1, "Blueberry");

        // Remove element
        vector.remove("Banana");
        System.out.println("Vector after removing 'Banana': " + vector);

        // Check if the vector contains an element
        boolean containsCherry = vector.contains("Cherry");
        System.out.println("Does the vector contain 'Cherry'? " + containsCherry);

        // Sort the vector
        Collections.sort(vector);
        System.out.println("Sorted Vector: " + vector);

        // Search for an element
        int index = Collections.binarySearch(vector, "Cherry");
        System.out.println("Index of 'Cherry': " + index);

        // Reverse the vector
        Collections.reverse(vector);
        System.out.println("Reversed Vector: " + vector);
    }
}
