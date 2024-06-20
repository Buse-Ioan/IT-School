package session_6_Core_Java_APIs.challenge;

//3. Concatenate Multiple Strings
//Description: Given a list of strings, use StringBuilder to concatenate them into a single string efficiently.

import java.util.ArrayList;
import java.util.List;

public class Challenge_3_ConcatenateStrings {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add(" ");
        strings.add("World");
        strings.add("!");

        // Concatenate strings using StringBuilder
        StringBuilder sb = new StringBuilder();
        for (String str : strings) {
            sb.append(str);
        }

        // Convert StringBuilder to String
        String concatenatedString = sb.toString();

        // Print the concatenated string
        System.out.println("Concatenated String: " + concatenatedString);
    }
}