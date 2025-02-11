package Collections;
import java.util.HashMap;

public class HashMapExample {
     public static void main(String[] args) {
        // Creating a HashMap
        HashMap<Integer, String> students = new HashMap<>();

        // Adding key-value pairs
        students.put(101, "Alice");
        students.put(102, "Bob");
        students.put(103, "Charlie");
        students.put(104, "David");
        students.put(105, "Eve");

        // Retrieving a value
        System.out.println("Student with Roll No 102: " + students.get(102));

        // Iterating over HashMap
        System.out.println("All students:");
        for (Integer rollNo : students.keySet()) {
            System.out.println("Roll No: " + rollNo + ", Name: " + students.get(rollNo));
        }
    }
}
