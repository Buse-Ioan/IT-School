package session_4_java_operators_and_loops.challenge;

//15. Write a Java program where you declare an integer variable total with a value of 100.
// Use the compound assignment operator to decrease the total by 20 and then print the value.
// Next, use another compound assignment operator to multiply the total by 2 and then print the value.

public class Challenge_15_CompoundAssigmentOperators {
    public static void main(String[] args) {
        int total = 100;

        total -= 20;
        System.out.println("Total after decreasing: " + total);

        total *= 2;
        System.out.println("total after multiplying: " + total);
    }
}
