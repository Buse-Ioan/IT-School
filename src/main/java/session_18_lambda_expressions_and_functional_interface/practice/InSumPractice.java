package session_18_lambda_expressions_and_functional_interface.practice;

public class InSumPractice {

    public static void main(String[] args) {
        IntSum result = (a, b) -> a + b;   //expresia Lambda
        System.out.println(result.sum(10, 15));
    }
}