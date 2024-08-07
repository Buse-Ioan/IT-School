package session_18_lambda_expressions_and_functional_interface.challenge;

//3.Write a program that uses lambda expressions to calculate the sum of all the elements in a list of integers.

import java.util.ArrayList;
import java.util.List;

public class Challenge_3_SumOfElements {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        // Calculate the sum using lambda expression
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);

        System.out.println("Sum of elements: " + sum);
    }
}