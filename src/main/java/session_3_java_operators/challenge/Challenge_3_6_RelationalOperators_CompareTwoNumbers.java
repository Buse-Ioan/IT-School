package session_3_java_operators.challenge;

// 6. Write a Java program that takes two numbers from the user and uses relational operators to display whether the first number is greater than,
// less than, or equal to the second number.

import java.util.Scanner;

public class Challenge_3_6_RelationalOperators_CompareTwoNumbers {
    public static void main(String[] args) {
        // Create a Scanner object to read inputfrom the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first number
        System.out.println("Enter first number: ");
        double number1 = scanner.nextDouble();

        // Prompt the user to enter the second number
        double number2 = scanner.nextDouble();

        // Use relational operators to compare the two numbers
        if (number1 > number2) {
            System.out.println("The first number is greater than the second number.");
        } else if (number1 < number2) {
            System.out.println("The fist number is less than the second number.");
        } else {
            System.out.println("The fisrt number is equal to the second number");
        }

        // Close the scanner
        scanner.close();
    }
}
