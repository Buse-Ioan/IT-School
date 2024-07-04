package session_9_arrays.challenge;

//4. Given an array of 10 integers, count how many of them are even numbers and how many are odd. Print out both counts.

public class Challenge_4_CountEvenOdd {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // Variables to store the count of even and odd numbers
        int evenCount = 0;
        int oddCount = 0;

        // Loop through the array and count even and odd numbers
        for (int number : numbers) {
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Print the counts
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers: " + oddCount);
    }
}