import java.util.*;

public class ArrayDequeueFunctions {
    public static void main(String[] args) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();

        // Adding elements to the deque
        deque.add(10);
        deque.addFirst(20);
        deque.addLast(30);
        System.out.println("Deque after additions: " + deque);

        // Add using offer
        deque.offer(15);
        deque.offerFirst(25);
        deque.offerLast(35);
        System.out.println("Deque after offers: " + deque);

        // Removing elements from the deque
        deque.removeFirst();
        System.out.println("Deque after removing first: " + deque);
        deque.removeLast();
        System.out.println("Deque after removing last: " + deque);
        deque.remove(10);
        System.out.println("Deque after removing 10: " + deque);

        // Remove using poll
        deque.pollFirst();
        System.out.println("Deque after polling first: " + deque);
        deque.pollLast();
        System.out.println("Deque after polling last: " + deque);

        // Peeking elements
        deque.add(40);
        System.out.println("First element (peekFirst): " + deque.peekFirst());
        System.out.println("Last element (peekLast): " + deque.peekLast());


    }
}
