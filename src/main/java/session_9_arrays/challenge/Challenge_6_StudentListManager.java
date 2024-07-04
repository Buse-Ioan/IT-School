package session_9_arrays.challenge;

//6. Given a LinkedList storing student names, write a program that checks if a particular student name exists in the list. If it does, remove that name from the list.

import java.util.LinkedList;
import java.util.Scanner;

public class Challenge_6_StudentListManager {
    public static void main(String[] args) {
        LinkedList<String> studentList = new LinkedList<>();

        studentList.add("Ion Barbu");
        studentList.add("Ana PopescuJ");
        studentList.add("Emilut Stoichescu");
        studentList.add("Mircea Bravo");
        studentList.add("Gogu Bascalie");

        Scanner scanner = new Scanner(System.in);
        String studentName = scanner.nextLine();

        scanner.close();

        if (studentList.contains(studentName)) {
            studentList.remove(studentName);
            System.out.println("The student name \"" + studentName + "\" has been removed from the list.");
        } else {
            System.out.println("The student name \"" + studentName + "\" is not in the list.");
        }
    }
}
