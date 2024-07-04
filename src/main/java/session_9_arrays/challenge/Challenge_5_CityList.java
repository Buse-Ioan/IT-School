package session_9_arrays.challenge;

//5. Create an ArrayList that stores city names. Add at least five city names initially.
// Then, prompt the user to add a city name.
// If the city name is already in the list, display a message saying it's a duplicate; otherwise, add it to the list.

import java.util.ArrayList;
import java.util.Scanner;

public class Challenge_5_CityList {
    public static void main(String[] args) {
        // Create an ArrayList to store city names
        ArrayList<String> cityList = new ArrayList<>();

        cityList.add("New York");
        cityList.add("Los Angeles");
        cityList.add("Iasi");
        cityList.add("Bucuresti");
        cityList.add("Timisoara");

        System.out.println("Initial list of cities: " + cityList);

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a city name to add: ");
        String newCity = scanner.nextLine();

        if (cityList.contains(newCity)) {
            System.out.println(newCity + " " + "It's a duplicate.");
        } else {
            cityList.add(newCity);
        }

        System.out.println("Updated list of cities: " + cityList);

        scanner.close();
    }
}