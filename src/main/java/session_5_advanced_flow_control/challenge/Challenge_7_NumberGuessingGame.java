package session_5_advanced_flow_control.challenge;

//7. Do-While Loop
//Create a program where the user is prompted to guess a predefined number.
// After each guess, the program should inform the user if the guess is too high or too low.
// The program should keep prompting the user until they guess correctly. Using a do-while loop, ensure the user is always asked at least once.

import java.util.Scanner;

public class Challenge_7_NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int predifinedNumber = 43;
        int guess;

        // Use a do-while loop to ensure the user is asked at least once
        do {
            System.out.print("Guess the number: ");
            guess = scanner.nextInt();

            // Check if the guess is too high, too low, or correct
            if (guess > predifinedNumber) {
                System.out.println("Your guess is too high. Try again.");
            } else if (guess < predifinedNumber) {
                System.out.println("Your guess is too low. Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number.");
            }

        } while (guess != predifinedNumber); // Continue the loop until the guess is correct
    }
}
