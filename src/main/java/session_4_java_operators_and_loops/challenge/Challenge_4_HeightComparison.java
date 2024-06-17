package session_4_java_operators_and_loops.challenge;

//4. Write a Java program where you declare two integer variables heightOne and heightTwo with any values.
// Use a ternary operator to determine the greater height and assign it to a variable maximumHeight. Print the result.

public class Challenge_4_HeightComparison {
    public static void main(String[] args) {
        int heightOne = 180;
        int heightTwo = 165;

        int maximumHeight = (heightOne > heightTwo) ? heightOne : heightTwo;

        System.out.println("The greater height: " + maximumHeight);
    }
}