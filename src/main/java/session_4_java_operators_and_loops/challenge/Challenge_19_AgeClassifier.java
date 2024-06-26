package session_4_java_operators_and_loops.challenge;

//19. Write a Java program that takes an integer variable age as input.
// Use a ternary operator to classify the person into one of the following categories:
// "Child" (age < 12), "Teenager" (age between 12 and 17), "Adult" (age between 18 and 64), and "Senior" (age 65 and above).
// Print the resulting classification.

import java.util.Scanner;

public class Challenge_19_AgeClassifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        // Use ternary operator to classify age
        String category = (age < 12) ? "Child" :
                          (age >= 12 && age <= 17) ? "Teenager" :
                          (age >= 18 && age <= 64) ? "Adult" :
                          "Senior";

        System.out.println("Classification: " + category);

        scanner.close();
    }
}