package session_4_java_operators_and_loops.challenge;

//9. Write a Java program to create two String variables, countryOne with the value "USA" and countryTwo with the value "USA".
// Check if countryOne and countryTwo are equal using the equals() method and print the result.
// Then change the value of countryTwo to "UK" and check for equality again. Print the result.

public class Challenge_9_CountryEqualityCheck {
    public static void main(String[] args) {
        String countryOne = "USA";
        String countryTwo = "UK";

        if (countryOne.equals(countryTwo)) {
            System.out.println("Same Country");
        } else {
            System.out.println("Different Country");
        }
    }
}
