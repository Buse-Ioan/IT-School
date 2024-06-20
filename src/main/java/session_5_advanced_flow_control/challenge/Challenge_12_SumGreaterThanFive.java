package session_5_advanced_flow_control.challenge;

//12. Continue Statement
//Create a program that asks the user for 10 numbers. Print the sum of all numbers that are greater than 5.
// If the user enters a number less than or equal to 5, use the continue statement to skip the addition for that number.

import java.util.Scanner;

public class Challenge_12_SumGreaterThanFive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        System.out.println("Please enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            number = scanner.nextInt();

            // If the number is less than or equal to 5, skip it
            if (number <= 5) {
                continue;
            }

            // Add the number to the sum
            sum += number;
        }

        System.out.println("The sum of all numbers greater than 5 is: " + sum);

        scanner.close();
    }
}