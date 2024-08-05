package session_18_lambda_expressions_and_functional_interface.challenge;

//4.You are given a List<String> representing a list of words. Create a lambda expression to sort the list in alphabetical order.
// Next, modify your lambda expression to sort the list in reverse alphabetical order.

import java.util.ArrayList;
import java.util.List;

public class Challenge_4_AlphabeticalSorter {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Banana");
        words.add("Cherry");
        words.add("Apple");
        words.add("Pink");
        words.add("Red");
        words.add("Yellow");

        // Sort the list in alphabetical order using lambda expression
        words.sort((s1, s2) -> s1.compareTo(s2));

        System.out.println("Alphabetical Order: " + words);

        // Sort the list in reverse alphabetical order using lambda expression
        words.sort((s1, s2) -> s2.compareTo(s1));

        System.out.println("Reverse Alphabetical Order: " + words);
    }
}