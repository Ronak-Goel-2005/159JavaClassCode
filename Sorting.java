import java.util.*;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 2));
        System.out.println("Original List: " + list);

        Collections.sort(list);
        System.out.println("Sorted List: " + list);
        
        Collections.reverse(list);
        System.out.println("Reversed List: " + list);
    }
}
