package session_4_java_operators_and_loops.challenge;

//14. Write a Java program where you declare an integer variable counter with a value of 0.
// Use the increment operator to increase the value of counter by 1 and then print the value.
// After that, use the decrement operator to decrease the value of counter by 1 and then print the value.

public class Challenge_14_IncrementDecrementOperator {
    public static void main(String[] args) {
        int counter = 0;

        counter++;
        System.out.println("After incrementing, counter: " + counter);

        counter--;
        System.out.println("After decrementing, counter: " + counter);
    }
}