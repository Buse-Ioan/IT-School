package session_5_advanced_flow_control.challenge;

//11. Break Statement
//Write a program that prompts the user to enter numbers. Calculate the average of these numbers.
// If the user enters 0, break out of the input loop and then print the average of the numbers entered so far.

import java.util.Scanner;

public class Challenge_11_CalculateAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        double sum = 0;
        double number;

        System.out.println("Enter numbers to calculate their average. Enter 0 to stop.");

        while (true) {
            System.out.print("Enter a number: ");
            number = scanner.nextDouble();

            // Check if the user entered 0
            if (number == 0) {
                break;
            }

            // Add the number to the sum and increment the count
            sum += number;
            count++;
        }

        // Calculate the average
        double average = count == 0 ? 0 : sum / count;

        System.out.println("The average of the numbers entered is: " + average);

        scanner.close();
    }
}