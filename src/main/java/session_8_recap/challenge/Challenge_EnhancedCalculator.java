package session_8_recap.challenge;

    /* 11. Create a basic calculator that can accept 2 numbers from the user and use them for the following operations: +,-,*,/.
    User should pe prompted with a message to enter two numbers for the mathematical operation.
    User should pe prompted with a message to enter the operator that he wants to use (+,-,*,/)
    Consider some validations in case the user doesn’t enter a proper number value:
    -	The number is too large
    -	The format in not the one we expect
    -	Any other edge case you can think of
    -	Instruct the user what he has to do, with a message, if he finds himself on the edge case
    After the operation is complete, the user should have the option to either enter 2 other numbers from another mathematical operations, or exit the program. */

import java.util.Scanner;

public class Challenge_EnhancedCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter the first number: ");
            double number1 = scanner.nextDouble();

            System.out.println("Enter the second number: ");
            double number2 = scanner.nextDouble();

            System.out.println("Enter an operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            double result;
            switch (operator) {
                case '+':
                    result = number1 + number2;
                    System.out.println("Addition result: " + result);
                    break;
                case '-':
                    result = number1 - number2;
                    System.out.println("Subtraction result: " + result);
                    break;
                case '*':
                    result = number1 * number2;
                    System.out.println("Subtraction result: " + result);
                    break;
                case '/':
                    if (number2 != 0) {
                        result = number1 / number2;
                        System.out.println("Subtraction result: " + result);
                    } else {
                        System.out.println("Error: Division by zero is not allowed.");
                    }
                    break;
                default:
                    System.out.println("Error: Invalid operator.");
                    continue;
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String response = scanner.next();
            if (!response.equals("yes")) {
                break;
            }
        }

        System.out.println("Thank you for using the calculator. Goodbye!");
        scanner.close();
    }
}