package session_7_utility_classes.challenge;

//4. Comparing User-Entered Dates
//Description: Write a method named areDatesEqual that reads two dates from the console and returns true if they are equal, and false otherwise.
//Input: Two dates entered by the user in the format YYYY-MM-DD.
//Expected Output:
//true if both dates are equal.
//false if they are different.

import java.util.Scanner;

public class Challenge_4_DateComparison___unfinished {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first date (YYY-MM-DD: ");
        String date1String = scanner.nextLine();

        System.out.println("Enter the second date (YYY-MM-DD: ");
        String date2String = scanner.nextLine();

        scanner.close();

    }
}
