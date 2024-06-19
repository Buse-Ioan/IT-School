package session_4_java_operators_and_loops.challenge;

//13. Write a Java program where you declare two boolean variables isRaining and isSunny with values of true and false, respectively.
// Use the logical complement operator to negate the values of both variables and print the new values.

public class Challenge_13_LogicalComplementOperator {
    public static void main(String[] args) {
        boolean isRaining = true;
        boolean isSunny = false;

        // Negate the values using logical complement operator
        boolean notRaining = !isRaining;
        boolean notSunny = !isSunny;

        System.out.println("Original isRaining: " + isRaining);
        System.out.println("Negated isRaining: " + notRaining);
        System.out.println("Original isSunny: " + isSunny);
        System.out.println("Negated isSunny: " + notSunny);
    }
}