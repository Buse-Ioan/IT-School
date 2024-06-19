package session_5_advanced_flow_control.challenge;

//5. Fibonacci Series Generator
//Write a program that generates and prints the first n numbers of the Fibonacci series, where n is provided by the user.

import java.util.Scanner;

public class Challenge_5_FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = scanner.nextInt();

        // Generate and print the Fibonacci series
        System.out.println("Fibonacci series of " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }

        scanner.close();
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}