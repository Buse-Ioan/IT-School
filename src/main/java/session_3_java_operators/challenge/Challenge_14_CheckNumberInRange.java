package session_3_java_operators.challenge;

// 14. Create a program that checks if a user entered number is within a specific range (e.g., 1-100). Use relational operators for the checks.

import java.util.Scanner;

public class Challenge_14_CheckNumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // Check if the number is withinn the range 1-100
        if (number >= 1 && number <= 100) {
            System.out.println("The number is within the range of 1 to 100");
        } else {
            System.out.println("The number is NOT within the range of 1 to 100");
        }
    }
}