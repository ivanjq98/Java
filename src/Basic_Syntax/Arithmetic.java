package Basic_Syntax;
import java.util.Scanner; // Allows us to take user input in Java
// What is Scanner? It is a built-in Java class used to read input from various sources like: keyboard, files, strings

public class Arithmetic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.in means the input will be taken from the keyboard (console)

        // Taking user input
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt(); // Reads a full line

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt(); // Reads an integer

        // Performing arithmetic operations
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;  // Integer division

        // Displaying results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);

        scanner.close(); // Avoid resource leaks
    }
}
