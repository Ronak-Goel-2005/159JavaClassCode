import java.util.*;
import java.lang.*;

public class Sorting {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 2));
        System.out.println("Original List: " + list);

        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        Collections.reverse(list);
        System.out.println("Reversed List: " + list);

        // Use of Comparable
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        System.out.println("Original People List: " + people);
        Collections.sort(people);
        System.out.println("Sorted People List by Age: " + people);

        // Use of Comparator
        Collections.sort(people, new NameComparator());
        System.out.println("Sorted People List by Name: " + people);
    }
}
