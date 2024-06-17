package session_3_java_operators.challenge;

// 11. Write a Java program that takes two boolean inputs from a user. Apply the logical negation operator (!) to each and print the result.

import java.util.Scanner;

public class Challenge_11_BooleanNegation {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first boolean value (true/false): ");
        boolean boolean1 = scanner.nextBoolean();

        System.out.println("Enter second boolean value (true/false): ");
        boolean boolean2 = scanner.hasNext();

        // Apply the logical negation operator to each boolean value
        boolean negBoolean1 = !boolean1;
        boolean negBoolean2 = !boolean2;

        System.out.println("The negation of " + boolean1 + " is: " + negBoolean1);
        System.out.println("The negation of " + boolean2 + " is: " + negBoolean2);

        scanner.close();
    }
}