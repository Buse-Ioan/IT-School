package session_4_java_operators_and_loops.challenge;

public class Challenge_17_AuthenticationSystem {
    public static void main(String[] args) {
        boolean hasUsername = true;
        boolean hasPassword = true;

        // Case 1: Both username and password are true
        if (hasUsername && hasPassword) {
            System.out.println("Authentication successful");
        }

        // Case 2: Username or password is false
        else if (!hasUsername || !hasPassword) {
            System.out.println("Authentication failed");
        }

        // Case 3: Username is true but password is false
        else if (hasUsername && !hasPassword) {
            System.out.println("Password is incorrect");
        }
    }
}