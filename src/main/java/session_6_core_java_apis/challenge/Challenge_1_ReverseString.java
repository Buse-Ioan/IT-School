package session_6_core_java_apis.challenge;

//1. Reverse a String
//Description: Use the StringBuilder class to write a program that reverses an input string. For example, the input "hello" should return "olleh".

import java.util.Scanner;

public class Challenge_1_ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        // Use StringBuilder to reverse the string
        StringBuilder reversed = new StringBuilder(input);
        reversed.reverse();

        // Print the reversed string
        System.out.println("Reversed string: " + reversed.toString());
    }
}