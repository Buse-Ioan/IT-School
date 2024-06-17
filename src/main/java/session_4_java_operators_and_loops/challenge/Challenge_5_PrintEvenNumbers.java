package session_4_java_operators_and_loops.challenge;

//5. Write a Java program to print the numbers from 1 to 10 using a for loop. As a next step, modify your program to print only the even numbers from 1 to 10.

public class Challenge_5_PrintEvenNumbers {
    public static void main(String[] args) {
        for (int x = 1; x <= 10; x++) {  // print numbers
            if (x % 2 == 0) {  // Print even numbers
                System.out.println(x);
            }
        }
    }
}