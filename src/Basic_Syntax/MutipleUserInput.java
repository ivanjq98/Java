package Basic_Syntax;

import java.util.Scanner;

public class MutipleUserInput {
     // Method 1: Multiply two integers
    public static int multiply(int a, int b) {
        return a * b;
    }

    // Method 2: Multiply two double values
    public static double multiply(double a, double b) {
        return a * b;
    }

    // Method 3: Multiply three integers
    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Getting user input for two integers
        System.out.print("Enter first integer: ");
        int int1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int int2 = scanner.nextInt();
        System.out.println("Multiplication of two integers: " + multiply(int1, int2));

        // Getting user input for two double values
        System.out.print("\nEnter first double: ");
        double double1 = scanner.nextDouble();
        System.out.print("Enter second double: ");
        double double2 = scanner.nextDouble();
        System.out.println("Multiplication of two doubles: " + multiply(double1, double2));

        // Getting user input for three integers
        System.out.print("\nEnter first integer: ");
        int int3 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int int4 = scanner.nextInt();
        System.out.print("Enter third integer: ");
        int int5 = scanner.nextInt();
        System.out.println("Multiplication of three integers: " + multiply(int3, int4, int5));

        scanner.close();
    }
}
