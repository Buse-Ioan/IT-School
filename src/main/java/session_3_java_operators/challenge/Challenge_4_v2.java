package session_3_java_operators.challenge;

//4. Write a Java program that uses both the increment (++) and decrement (--) operators in a loop to count up to 10 and then back down to 1.

public class Challenge_4_v2 {
    public static void main(String[] args) {
        int count = 1;
        System.out.println(count);

        // Counting from 1 to 10
        while (count < 10) {
            // count = ++count;
            count++;
            System.out.println(count);
        }

        System.out.println(" ");

        while (count > 0) {
            System.out.println(count);
            // count = --count;
            count--;
        }
    }
}