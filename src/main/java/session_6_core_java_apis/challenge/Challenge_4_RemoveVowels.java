package session_6_core_java_apis.challenge;

//4. Removing Vowels
//Description: Create a Java program that uses the StringBuilder class to remove all the vowels from an input string.

import java.util.Scanner;

public class Challenge_4_RemoveVowels {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        scanner.close();

        // Remove vowels using StringBuilder
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!isVowel(ch)) {
                result.append(ch);
            }
        }

        // Print the result without vowels
        System.out.println("String without vowels: " + result.toString());
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char ch) {
        ch = Character.toLowerCase(ch); // Convert to lowercase for case insensitivity
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}