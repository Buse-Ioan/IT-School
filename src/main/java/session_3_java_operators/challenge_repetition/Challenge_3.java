package session_3_java_operators.challenge_repetition;

// 3. Write a program to check if a number is positive or negative using logical complement operator.

import java.util.Scanner;

public class Challenge_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number here: ");
        int number = scanner.nextInt();

        if (number >= 0) {
            System.out.println("Number is positive.");
        } else {
            System.out.println("Number is negative.");
        }
        scanner.close();
    }
}
