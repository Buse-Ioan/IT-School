package session_3_java_operators.challenge;

//2. Create a Java program where you increment and decrement the same variable. Display the value of the variable after each operation.

public class Challenge_3_2 {
    public static void main(String[] args) {
        //Define and initialize a variable
        int number = 10;

        // Display the initial value
        System.out.println("Initial value: " + number);

        // Increment the variable
        number++;
        System.out.println("After incrementing: " + number);

        // Decrement the variable
        number--;
        System.out.println("Afterdecrement: " + number);

        // Increment the variable using += operator
        number += 1;
        System.out.println("After incrementing using +=: " + number);

        // Decrement the variable using += operator
        number -= 1;
        System.out.println("After decrementing using +=: " + number);
    }
}
