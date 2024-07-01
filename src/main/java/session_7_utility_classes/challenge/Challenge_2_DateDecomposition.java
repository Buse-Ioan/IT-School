package session_7_utility_classes.challenge;

//2. Date Decomposition
//Description: Write a method named displayDateComponents that accepts a date as an argument and prints its year, month, and day components separately.
//Input: A date in the format YYYY-MM-DD.
//Expected Output:
//makefile
//Copy code
//Year: YYYY
//Month: MM
//Day: DD

import java.time.LocalDate;

public class Challenge_2_DateDecomposition {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2024, 06, 26);
        displayDateComponents(date);
    }

    public static void displayDateComponents(LocalDate date) {
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();

        System.out.println("Year: " + year);
        System.out.println("Month: " + month);
        System.out.println("Day: " + day);
    }
}
