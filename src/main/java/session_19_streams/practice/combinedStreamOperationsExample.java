package session_19_streams.practice;

import java.util.Arrays;
import java.util.List;

public class combinedStreamOperationsExample {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("John", "Doe", 25),
                new User("Bob", "Smith", 28),
                new User("Alice", "Carter", 23)
        );

        //filer users younger than 27
        //map to full names
        //sort by last name
        //collect into a list

        List<String> resultList = users.stream()
                .filter(user -> user.getAge() < 27)
                .map(user -> user.getFirstName() + " " + user.getLastName())
                .sorted()
                .toList();

        System.out.println(resultList);
    }
}