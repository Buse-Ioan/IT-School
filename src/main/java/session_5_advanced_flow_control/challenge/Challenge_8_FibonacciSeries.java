package session_5_advanced_flow_control.challenge;

//8. For Loop
//Write a program that prints the first 10 numbers in the Fibonacci series. Use a for loop to accomplish this.

public class Challenge_8_FibonacciSeries {
    public static void main(String[] args) {
        int n = 10; // Number of Fibonacci numbers to print
        int first = 0;
        int second = 1;

        System.out.println("The first " + n + " numbers in the Fibonacci series are:");

        for (int i = 0; i < n; i++) {
            if (i <= 1) {
                System.out.print(i + " ");
            } else {
                int next = first + second;
                System.out.print(next + " ");
                first = second;
                second = next;
            }
        }
    }
}