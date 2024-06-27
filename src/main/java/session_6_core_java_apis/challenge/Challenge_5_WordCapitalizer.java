package session_6_core_java_apis.challenge;

//5. Word Capitalizer
//Description: Write a program that capitalizes the first letter of every word in a sentence using the StringBuilder class.

import java.util.Scanner;

public class Challenge_5_WordCapitalizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        scanner.close();

        // Capitalize first letter of every word using StringBuilder
        StringBuilder result = new StringBuilder();
        boolean capitalizeNext = true; // Flag to track if next character should be capitalized

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                if (capitalizeNext) {
                    result.append(Character.toUpperCase(ch));
                    capitalizeNext = false;
                } else {
                    result.append(Character.toLowerCase(ch));
                }
            } else {
                // If character is not a letter, just append it (like spaces or punctuation)
                result.append(ch);

                // Set capitalizeNext flag to true for next word
                if (ch == ' ') {
                    capitalizeNext = true;
                }
            }
        }

        System.out.println("Capitalized sentence: " + result.toString());
    }
}