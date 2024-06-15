package session_1_.challenge;

// 3. Operations: Write a program that performs various operations (addition, subtraction, multiplication, division, and modulus) on two numbers. The numbers can be hard-coded into the program. Print the result of each operation.

public class Challenge_1_3_Operations {
    public static void main(String[] args) {
        // Define numbers
        int number1 = 10;
        int number2 = 2;

        // Perform operations
        int addition = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        int division = number1 / number2;
        int modulus = number1 % number2;

        // Print the results of each operation
        System.out.println("Addition: " + number1 + " + " + number2 + " = " + addition);
        System.out.println("Subtraction: " + number1 + " - " + number2 + " = " + subtraction);
        System.out.println("Multiplication: " + number1 + " * " + number2 + " = " + multiplication);
        System.out.println("Division: " + number1 + " / " + number2 + " = " + division);
        System.out.println("Modulus: " + number1 + " % " + number2 + " = " + modulus);
    }
}
