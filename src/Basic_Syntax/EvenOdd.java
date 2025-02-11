package Basic_Syntax;

import java.util.Scanner;

public class EvenOdd {
     public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Checking if the number is even or odd
        if (num % 2 == 0) {
            System.out.println(num + " is even.");
        } else {
            System.out.println(num + " is odd.");
        }
        
        scanner.close();
    }
}
