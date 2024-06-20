package session_5_advanced_flow_control.challenge;

//6. While Loop
//Write a program that asks the user to enter numbers.
// The program should continue prompting the user until they enter -1.
// After they enter -1, print the sum of all numbers entered (excluding -1).

import java.util.Scanner;

public class Challenge_6_SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;

        while (true) {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();

            if (number == -1) {
                break;  // exit the loop if the user enters -1
            }

            sum += number;  // add the number to the sum
        }

        System.out.println("Sum of all numbers entered: " + sum);

        scanner.close();
    }
}