package session_4_java_operators_and_loops.challenge;

//20. Write a Java program that takes three integer variables a, b, and c as input.
// Use nested ternary operators to find and print the largest number among the three.

import java.util.Scanner;

public class Challenge_20_LargestNumberFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter three integers
        System.out.print("Enter three integers (separated by space): ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Use nested ternary operators to find the largest number
        int largest = (a >= b) ? (a >= c ? a : c) : (b >= c ? b : c);

        // Print the largest number
        System.out.println("Largest number among " + a + ", " + b + ", and " + c + " is: " + largest);

        scanner.close();
    }
}