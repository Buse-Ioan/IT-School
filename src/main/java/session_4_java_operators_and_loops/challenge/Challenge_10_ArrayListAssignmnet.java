package session_4_java_operators_and_loops.challenge;

//10. Write a Java program that creates two distinct ArrayList objects, listOne and listTwo.
// Add some elements to listOne and assign listOne to listTwo. Now modify listOne by adding a new element.
// Print both lists and observe the output.

import java.util.ArrayList;

public class Challenge_10_ArrayListAssignmnet {
    public static void main(String[] args) {

        // Create the first ArrayList and add some elements
        ArrayList<String> listOne = new ArrayList<>();
        listOne.add("Banana");
        listOne.add("Apple");
        listOne.add("Mango");

        // Assign listOne to listTwo
        ArrayList<String> listTwo = listOne;

        // Modify listOne by adding a new element
        listOne.add("Cherry");

        // Print both lists
        System.out.println("List One: " + listOne);
        System.out.println("List Two: " + listTwo);
    }
}