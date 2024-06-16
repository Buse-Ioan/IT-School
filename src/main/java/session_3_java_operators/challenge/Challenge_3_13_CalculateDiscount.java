package session_3_java_operators.challenge;

// 13. Write a program to calculate the price after discount. Take the original price and discount percentage as input.
// Use compound assignment operator to perform the calculation.

import java.util.Scanner;

public class Challenge_3_13_CalculateDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter original price: ");
        double originalPrice = scanner.nextDouble();

        // Take input for discount percentage
        System.out.println("Enter the discount percentage (%): ");
        double discountPercentage = scanner.nextDouble();

        // Calculate discount price using compound operator
        double discountedPrice = originalPrice * (1 - discountPercentage / 100);

        // Display the original price, discout percentage and discount price
        System.out.println("Original Price: " + originalPrice);
        System.out.println("Discount Percentage: " + discountPercentage);
        System.out.println("Price after Discount: " + discountedPrice);
    }
}
