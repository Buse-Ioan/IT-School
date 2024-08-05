package session_18_lambda_expressions_and_functional_interface.practice;

import java.util.List;

@FunctionalInterface

public interface NegativeFilter {

    List<Integer> filter (List<Integer> numbers);
}
