package session_5_advanced_flow_control.challenge;

//4. String Reverser
//Ask the user to enter a string. Print the reversed version of this string.

import java.util.Scanner;

public class Challenge_4_StringReverser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string
        String reversed = reverseString(input);

        System.out.println("Reversed string: " + reversed);

        scanner.close();
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        return sb.toString();
    }
}