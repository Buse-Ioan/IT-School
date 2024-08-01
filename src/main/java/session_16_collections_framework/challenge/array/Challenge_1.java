package session_16_collections_framework.challenge.array;

//Write a Java program to create a new array list, add some colors (string) and print out the collection.

import java.util.ArrayList;

public class Challenge_1 {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Green");

        System.out.println("List of color:");
        for (String color : colors){
            System.out.println(color);
        }
    }
}