package session_3_java_operators.practice;

import java.util.Scanner;

public class Problem1 {

    /*
    */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter fisrt number");
        int x = sc.nextInt();

        System.out.println("Please enter second number");
        int y = sc.nextInt();

        int remainder = x % y;
        double power = Math.pow(x, y);

        System.out.println("Reminder: " + remainder);
        System.out.println("Power: " + power);
    }

}
