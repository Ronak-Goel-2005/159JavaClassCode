import java.util.*;

public class StackFunctions {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Apple");
        stack.push("Banana");
        stack.push("Cherry");
        stack.push("Mango");
        stack.push("Orange");
        System.out.println("Original Stack: " + stack);

        // Size of the Stack
        int size = stack.size();
        System.out.println("Size: " + size);

        // Pop an element
        String poppedElement = stack.pop();
        System.out.println("Popped Element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);

        // Peek at the top element
        String topElement = stack.peek();
        System.out.println("Top Element: " + topElement);

        // Check if the stack is empty
        boolean isEmpty = stack.isEmpty();
        System.out.println("Is the stack empty? " + isEmpty);

        // Search for an element
        int position = stack.search("Banana");
        System.out.println("Position of 'Banana' from top: " + position);
    }
}
