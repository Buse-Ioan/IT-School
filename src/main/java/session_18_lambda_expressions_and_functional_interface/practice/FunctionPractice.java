package session_18_lambda_expressions_and_functional_interface.practice;

import java.util.function.Function;

public class FunctionPractice {

    public static void main(String[] args) {
        Function<String, Integer> strLenghtFinder = str -> str.length();
        System.out.println(strLenghtFinder.apply("Hello"));
    }
}