package session_6_core_java_apis.challenge;

//2. Palindrome Checker
//Description: Write a program that checks whether a given string is a palindrome using the StringBuilder class.
// A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward.

import java.util.Scanner;

public class Challenge_2_PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        // Create a StringBuilder to reverse the input string
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();

        // Check if the original and reversed strings are equal
        if (input.equalsIgnoreCase(reversed.toString())) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}