package session_18_lambda_expressions_and_functional_interface.challenge;

//2.Write a program that uses lambda expressions to sort a list of strings in alphabetical order.

import java.util.ArrayList;
import java.util.List;

public class Challenge_2_StringSorter {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Diana");
        names.add("Tom");
        names.add("Bobbie");
        names.add("Andrew");

        // Sort the list using lambda expression
        names.sort((s1, s2) -> s1.compareTo(s2));

        System.out.println("Sorted names: " + names);
    }
}