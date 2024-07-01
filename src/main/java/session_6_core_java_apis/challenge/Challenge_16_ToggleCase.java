package session_6_core_java_apis.challenge;

//16. Toggling Case
//Description: Design a program using StringBuilder that toggles the case of every character in a given string. For example, "HelLo" should become "hELlO".

import java.util.Scanner;

public class Challenge_16_ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // Create a StringBuilder object to modify the string
        StringBuilder toggledString = new StringBuilder(input);

        // Loop through each character in the string
        for (int i = 0; i < toggledString.length(); i++) {
            char c = toggledString.charAt(i);

            // Check if the character is uppercase
            if (Character.isUpperCase(c)) {
                // Convert to lowercase
                toggledString.setCharAt(i, Character.toLowerCase(c));
            } else {
                // Convert to uppercase
                toggledString.setCharAt(i, Character.toUpperCase(c));
            }
        }
        System.out.println("Toggled case string: " + toggledString.toString());

        scanner.close();
    }
}