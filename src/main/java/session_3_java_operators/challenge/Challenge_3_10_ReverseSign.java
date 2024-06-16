package session_3_java_operators.challenge;

// 10. Write a program that reverses the sign of an entered integer using unary minus operator.

import java.util.Scanner;

public class Challenge_3_10_ReverseSign {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter an integer
        System.out.println("Enter an ineger: ");
        int number = scanner.nextInt();

        // Reverse sign of an entered integer using unary minus operator
        int reversedSignNumber = -number;

        // Display the result
        System.out.println("The number with reversed sign is: " + reversedSignNumber);
    }
}
