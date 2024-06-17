package session_4_java_operators_and_loops.challenge;

//2.  Write a Java program to declare two integer variables firstNumber and secondNumber with any values. Use an
// equality operator to compare these two numbers and print the result. Do the same for two String objects
// firstString and secondString with the same value, but use the equals() method for comparison. Print the result.

public class Challenge_2_Comparison {
    public static void main(String[] args) {
        int firstNumber = 10;
        int secondNumber = 20;

        boolean numberEqual = (firstNumber == secondNumber);

        System.out.println("Equal numbers: " + numberEqual);

        String firstString = "OpenAI";
        String secondString = "OpenAI";

        boolean stringEqual = firstString.equals(secondString);

        System.out.println("Equal string: " + stringEqual);
    }
}