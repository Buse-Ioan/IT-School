package session_5_advanced_flow_control.challenge;

//1. Even or Odd Checker
//Write a Java program that takes an integer as input. If the number is even, print "Even". If it's odd, print "Odd".

import java.util.Scanner;

public class Challenge_1_EvenOddChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.close();

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}