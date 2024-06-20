package session_5_advanced_flow_control.challenge;

//9. For-Each Loop
//Given an array of integers, write a program that prints each number in the array followed by "Even" if the number is even, or "Odd" if the number is odd. Utilize a for-each loop for this task.

public class Challenge_9_EvenOddArray {
    public static void main(String[] args) {
        // Define an array of integers
        int[] arrayNumbers = {10, 15, 23, 42, 56, 77, 88, 91, 102, 135};

        // Use a for-each loop to iterate through the array
        for (int number : arrayNumbers) {
            String type = (number % 2 == 0) ? "Even" : "Odd";

            System.out.println(number + " - " + type);
        }
    }
}