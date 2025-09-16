import java.util.*;

public class PriorityQueueFunctions {
    public static void main(String[] args) {
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Apple");
        priorityQueue.add("Banana");
        priorityQueue.add("Cherry");
        priorityQueue.add("Mango");
        priorityQueue.add("Orange");
        System.out.println("Original Priority Queue: " + priorityQueue);

        // Size of the Priority Queue
        int size = priorityQueue.size();
        System.out.println("Size: " + size);

        // Poll an element
        String polledElement = priorityQueue.poll();
        System.out.println("Polled Element: " + polledElement);
        System.out.println("Priority Queue after poll: " + priorityQueue);

        // Peek at the head element
        String headElement = priorityQueue.peek();
        System.out.println("Head Element: " + headElement);

        // Check if the priority queue is empty
        boolean isEmpty = priorityQueue.isEmpty();
        System.out.println("Is the priority queue empty? " + isEmpty);

        // Search for an element (not directly supported, so we convert to array)
        Object[] elements = priorityQueue.toArray();
        boolean containsBanana = Arrays.asList(elements).contains("Banana");
        System.out.println("Does the priority queue contain 'Banana'? " + containsBanana);
    }
}
