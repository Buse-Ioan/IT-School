package session_19_streams.practice;

import java.util.Arrays;
import java.util.List;

public class MapUserFullNameExample {

    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("John", "Doe", 25),
                new User("Bob", "Smith", 28),
                new User("Alice", "Carter", 23)
        );

        //map ussers to their full name and collect into a list
        List<String> fullNames = users.stream()
                .map(name -> name.getFirstName() + " " + name.getLastName())
                .toList();
    }
}