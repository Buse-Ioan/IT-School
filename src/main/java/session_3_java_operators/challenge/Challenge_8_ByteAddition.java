package session_3_java_operators.challenge;

//8. Create a program that takes two byte values, adds them together, and stores the result in a byte variable.

import java.util.Scanner;

public class Challenge_8_ByteAddition {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first byte value
        System.out.println("Enter the first byte value: ");
        byte byte1 = scanner.nextByte();

        // Prompt the user to enter the second byte value
        System.out.println("Enter the second byte value: ");
        byte byte2 = scanner.nextByte();

        // Calculate result
        int result = byte1 + byte2;

        // Cast the result back to the byte and store it in a byte variable
        byte sum = (byte) result;
        System.out.println("byte1 + byte2 = " + sum);
    }
}