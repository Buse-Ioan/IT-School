package session_18_lambda_expressions_and_functional_interface.practice;

public class IntMultiplyPractice {

    public static void main(String[] args) {
        IntMultiply result = (a, b) -> a * b;
        System.out.println(result.multiply(2, 3));
    }
}