package session_18_lambda_expressions_and_functional_interface.challenge;

//1.Write a program that uses lambda expressions to filter a list of integers and return only the even numbers.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge_1_EvenNumberFilter {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        List<Integer> evenNumbers = numbers.stream()
                .filter(n -> n % 2 == 0)
                .collect(Collectors.toList());

        System.out.println("Even Numbers: " + evenNumbers);
    }
}