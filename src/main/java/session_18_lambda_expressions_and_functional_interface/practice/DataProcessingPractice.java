package session_18_lambda_expressions_and_functional_interface.practice;

import java.util.Arrays;
import java.util.List;

public class DataProcessingPractice {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "John", "Bob");

        //using streams & lambda - Functional Programming
        names.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);

        //using "traditional way" - Imperative Programming (ii spus ce sa faca la fiecare pras)
        for (String name : names) {
            if (name.startsWith("A")) {
                System.out.println(name);
            }
        }
    }
}