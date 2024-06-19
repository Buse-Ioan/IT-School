package session_4_java_operators_and_loops.challenge;

//16. Write a Java program where you use unary operators to perform a series of transformations on an integer variable number initialized to 50.
// First, negate number, then take the absolute value, and finally increment it by 1. Print the result at each step.

public class Challenge_16_UnaryOperatorsExample {
    public static void main(String[] args) {
        int number = 50;

        // Step 1: Negate the number
        System.out.println("Step 1: Negate the number");
        number = -number;
        System.out.println("Result after negation: " + number);

        // Step 2: Take the absolute value
        System.out.println("\nStep 2: Take the absolute value");
        number = Math.abs(number);
        System.out.println("Result after taking absolute value: " + number);

        // Step 3: Increment by 1
        System.out.println("\nStep 3: Increment by 1");
        number++;
        System.out.println("Result after incrementing by 1: " + number);
    }
}
