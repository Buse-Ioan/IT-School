package session_4_java_operators_and_loops.challenge;

//18. Write a Java program where you declare an integer array with 5 elements.
// Use a for loop to initialize the array such that each element is equal to its index incremented by 1.
// Then use another for loop to decrement each element by 1. Print the array before and after the decrement operation using a for-each loop.

public class Challenge_18_ArrayInitializationAndDecrement {
    public static void main(String[] args) {
        // Declare an integer array with 5 elements
        int[] array = new int[5];

        // Initialize the array using a for loop
        for (int index = 0; index < array.length; index++) {
            array[index] = index + 1; // Each element is initialized to its index incremented by 1
        }

        // Print the array before decrementing
        System.out.println("Array before decrementing:");
        printArray(array);

        // Decrement each element by 1 using another for loop
        for (int index = 0; index < array.length; index++) {
            array[index]--; // Decrement each element by 1
        }

        // Print the array after decrementing
        System.out.println("\nArray after decrementing:");
        printArray(array);
    }

    // Method to print the elements of the array using a for-each loop
    public static void printArray(int[] array) {
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}