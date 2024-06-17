package session_3_java_operators.challenge;

// 3. Write a program to check if a number is positive or negative using logical complement operator.

import java.util.Scanner;

public class Challenge_3_v2 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter number
        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        //Display the result
        if (number >= 0) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }
        // Close the scanner
        scanner.close();
    }
}