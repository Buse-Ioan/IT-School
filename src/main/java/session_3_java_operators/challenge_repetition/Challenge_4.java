package session_3_java_operators.challenge_repetition;

//4. Write a Java program that uses both the increment (++) and decrement (--) operators in a loop to count up to 10 and then back down to 1.

public class Challenge_4 {
    public static void main(String[] args) {
        for (int i = 1; i <=10; i++) {
            System.out.println(i);
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
