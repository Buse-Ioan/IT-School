package session_5_advanced_flow_control.challenge;

//10. Jump Statements
//Create a menu-driven program where the user is presented with options:
//Print "Hello World"
//Print the user's name.
//Exit.
//Based on the user's input, perform the necessary action. Once an action is completed, show the menu again, unless the user chooses the Exit option. Use jump statements to control the flow of the program.

import java.util.Scanner;

public class Challenge_10_MenuDrivenProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        String name = "";

        while (true) {
            // Display menu
            System.out.println("Menu:");
            System.out.println("1. Print \"Hello World\"");
            System.out.println("2. Print your name");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Hello World");
                    break;

                case 2:
                    if (name.isEmpty()) {
                        System.out.print("Enter your name: ");
                        name = scanner.next(); // Read the user's name
                    }
                    System.out.println("Your name is: " + name);
                    break;

                case 3:
                    // Exit the program
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    return; // Use return to exit the main method

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println(); // Print a blank line for readability
        }
    }
}