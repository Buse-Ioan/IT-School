package session_3_java_operators.challenge;

import java.util.Scanner;

public class Challenge_3_1_RepetitionIsTheMotherOfSkill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the fisrt number: ");
        double number1 = scanner.nextDouble();

        System.out.println("Enter the second number: ");
        double number2 = scanner.nextDouble();

        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multipication = number1 * number2;
        double division = number1 / number2;
        double modulus = number1 % number2;

        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multipication);
        System.out.println("Division: " + division);
        System.out.println("Modulus: " + modulus);
    }
}
