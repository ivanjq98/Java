package Collections;
import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        // Creating a HashSet
        HashSet<String> cities = new HashSet<>();

        // Adding elements
        cities.add("New York");
        cities.add("London");
        cities.add("Tokyo");
        cities.add("New York"); // Duplicate entry

        // Printing elements
        System.out.println("Cities Set: " + cities);

        // Iterating using a for-each loop
        System.out.println("Iterating over HashSet:");
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
