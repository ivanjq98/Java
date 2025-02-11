package Basic_Syntax;

public class Overloading {
    public class MethodOverloadingExample {
    
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
            // Calling the overloaded methods
            System.out.println("Multiplication of two integers (5, 3): " + multiply(5, 3));
            System.out.println("Multiplication of two doubles (2.5, 4.0): " + multiply(2.5, 4.0));
            System.out.println("Multiplication of three integers (2, 3, 4): " + multiply(2, 3, 4));
        }
    }
}
