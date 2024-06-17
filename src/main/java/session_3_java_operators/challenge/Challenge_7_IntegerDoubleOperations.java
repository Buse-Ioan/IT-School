package session_3_java_operators.challenge;

//7. Write a program where you perform operations between an integer and a double. Display the result.

public class Challenge_7_IntegerDoubleOperations {
    public static void main(String[] args) {
        int integerNumber = 7;
        double doubleNumber = 3.4;

        // Perform arithmetic operations
        double addition = integerNumber + doubleNumber;
        double subtraction =  integerNumber - doubleNumber;
        double multiplication =  integerNumber * doubleNumber;
        double division =  integerNumber / doubleNumber;
        double modulus =  integerNumber % doubleNumber;


        // Display results
        System.out.println("Addition: " + integerNumber + " + " + doubleNumber + " = " + addition);
        System.out.println("Subtraction: " + integerNumber + " - " + doubleNumber + " = " + subtraction);
        System.out.println("Multiplication: " + integerNumber + " * " + doubleNumber + " = " + multiplication);
        System.out.println("Division: " + integerNumber + " / " + doubleNumber + " = " + division);
        System.out.println("Modulus: " + integerNumber + " % " + doubleNumber + " = " + modulus);
    }
}