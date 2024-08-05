package session_18_lambda_expressions_and_functional_interface.practice;

@FunctionalInterface
public interface StringProcessor {

    String processor(String input);

    default StringProcessor andThen(StringProcessor after) {
        return input -> after.processor(this.processor(input));
    }
}