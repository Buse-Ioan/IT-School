package session_7_utility_classes.challenge;

//3. Create a Specific Date
//Description: Write a method named createSpecificDate that returns a date object representing 19th August 2025.
//Expected Output: A date object for 2025-8-19.

import java.time.LocalDate;

public class Challenge_3_SpecificDateCreator {
    public static void main(String[] args) {
        // Create and print the specific date
        LocalDate specificDate = createSpecificDate();
        System.out.println("Specific Date: " + specificDate);
    }

    //Method to create a specific date
    public static LocalDate createSpecificDate() {
        // Create a LocalDate object for 19th August 2025
        LocalDate date = LocalDate.of(2025, 8, 19);
        return date;
    }
}