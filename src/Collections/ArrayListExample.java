package Collections;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample {
    public static void main(String[] args) {
        // Creating an ArrayList of Integers
        ArrayList<Integer> numbers = new ArrayList<>();

        // Adding elements
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original List: " + numbers);

        // Removing the second element (index 1)
        numbers.remove(1);
        System.out.println("After removing second element: " + numbers);

        // Sorting the list
        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);
    }
}
