package session_3_java_operators.challenge;

//4. Write a Java program that uses both the increment (++) and decrement (--) operators in a loop to count up to 10 and then back down to 1.

public class Challenge_3_4_CountUpAndDown {
    public static void main(String[] args) {
        // Counting from 1 to 10
        for (int x = 1; x <= 10; x++) {
            System.out.println("Counting up: " + x);
        }

        System.out.println(" ");

        //Counting down from 10 to 1
        for (int x = 10; x >= 1; x--) {
            System.out.println("Counting down: " + x);
        }
    }
}
