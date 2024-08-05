package session_19_streams.practice;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 6, 7);

        //summ al the numbers from the list
        int sum = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Sum of numbers: " + sum);
    }
}