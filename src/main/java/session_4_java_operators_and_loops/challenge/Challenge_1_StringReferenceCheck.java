package session_4_java_operators_and_loops.challenge;

//1. Write a Java program where you create two String objects named stringOne and stringTwo with the same value "OpenAI". Check and print whether they refer to the same object.

public class Challenge_1_StringReferenceCheck {
    public static void main(String[] args) {

        String stringOne = "OpenAI";
        String stringTwo = "OpenAI";

        boolean sameObject = (stringOne == stringTwo);

        System.out.println("StringOne & StringTwo refer to same object: " + sameObject);
    }
}
