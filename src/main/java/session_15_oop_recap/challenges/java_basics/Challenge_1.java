package session_15_oop_recap.challenges.java_basics;

 // Integer Overflow: Write a program that multiplies two int values and stores the result in an int.
//  What happens if the result is larger than the maximum int value? How can you handle this scenario?

public class Challenge_1 {
    public static void main(String[] args) {
        int number1 = 85;
        int number2 = 105;

        long result = number1 * number2;

        System.out.println("Result: " + result);
    }
}