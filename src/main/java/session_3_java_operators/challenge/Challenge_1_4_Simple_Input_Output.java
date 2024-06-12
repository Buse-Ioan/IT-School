package session_3_java_operators.challenge;

import java.util.Scanner;

public class Challenge_1_4_Simple_Input_Output {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter the first number
        System.out.println("Enter the first number: ");
        int number1 = scanner.nextInt();

        // Ask user to enter the second number
        System.out.println("Enter the second number: ");
        int number2 = scanner.nextInt();

        // Perform the addition
        int sum = number1 + number2;

        // Print the results
        System.out.println("The result of " + number1 + " + " + number2 + " = " + sum);
    }
}
