package session_3_java_operators.challenge;

import java.util.Scanner;

// 1. Write a Java program to take two numbers as input and display the result of addition, subtraction, multiplication, division, and modulus.

public class Challenge_3_1_AdditionSubtractionMultiplicationDivisionModulus {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter the first number
        System.out.println("Enter the first number: ");
        double number1 = scanner.nextDouble();

        // Ask user to enter the second number
        System.out.println("Enter the second number: ");
        double number2 = scanner.nextDouble();

        // Perform operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;
        double modulus = number1 % number2;

        // Print the results
        System.out.println("Addition: " + number1 + " + " + number2 + " = " + addition);
        System.out.println("Subtraction: " + number1 + " - " + number2 + " = " + subtraction);
        System.out.println("Multiplication: " + number1 + " * " + number2 + " = " + multiplication);
        System.out.println("Division: " + number1 + " / " + number2 + " = " + division);
        System.out.println("Modulus: " + number1 + " % " + number2 + " = " + modulus);
    }
}
