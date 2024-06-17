package session_3_java_operators.challenge;

// 9. Write a program that calculates the area of a rectangle. Take the length and breadth as inputs.

import java.util.Scanner;

public class Challenge_9_RectangleArea {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the lenght of the rectable: ");
        double lenght = scanner.nextDouble();

        System.out.println("Enter the lenght of the breadth: ");
        double breadth = scanner.nextDouble();

        double area = lenght * breadth;
        System.out.println("The area of the rectangle is: " + area);
    }
}