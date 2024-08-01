package session_18.practice;

public class InSumPractice {

    public static void main(String[] args) {
        IntSum result = (a, b) -> a + b;   //expresia Lambda
        System.out.println(result.sum(10, 15));
    }
}