package session_3_java_operators.challenge;

// 3. Write a program to check if a number is positive or negative using logical complement operator.

import java.util.Scanner;

public class Challenge_3_3 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter number
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        //Check if the number is sitive or negative using logical complement operator
        boolean isNonNegative = number >= 0;
        boolean isNegative = !isNonNegative;

        //Display the result
        if (isNegative) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is positive.");
        }

        // Close the scanner
        scanner.close();
            }
}
