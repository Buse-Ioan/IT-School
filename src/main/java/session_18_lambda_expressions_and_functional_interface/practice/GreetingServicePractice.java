package session_18_lambda_expressions_and_functional_interface.practice;

public class GreetingServicePractice {

    public static void main(String[] args) {
        //using anonymous classs
        GreetingService anonymousGreetingService = new GreetingService() {

            @Override
            public void greet(String message) {
                System.out.println(message + " from anonymous class");
            }
        };

        anonymousGreetingService.greet("Hello world");

        //using lambda expression
        GreetingService lambaGreetingService = input -> System.out.println(input + " from lambda expression");
        lambaGreetingService.greet("Hello world");
    }
}