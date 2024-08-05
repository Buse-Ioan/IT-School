package session_19_streams.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamGroupingByExample {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jack", "Alice", "Bob", "Brad");

        //group names by first letter
        Map<Character, List<String>> grouppedByFirstLetter = names.stream()
                .collect(Collectors.groupingBy(name -> name.charAt(0)));

        System.out.println(grouppedByFirstLetter);
    }
}