package session_9_arrays.challenge;

//3. Create
//2 empty ArrayLists: studentList and graduateStudentList
//populate studentList with 10 students
//copy values from studentList to graduateStudentList
//iterate through graduateStudentList and print each graduated student

import java.util.ArrayList;

public class Challenge_3_StudentLists {
    public static void main(String[] args) {
        ArrayList<String> studentList = new ArrayList<>();
        ArrayList<String> graduateStudentList = new ArrayList<>();

        studentList.add("John Doe");
        studentList.add("Jane Smith");
        studentList.add("Emily Johnson");
        studentList.add("Michael Brown");
        studentList.add("Sarah Davis");
        studentList.add("David Wilson");
        studentList.add("Laura Taylor");
        studentList.add("Daniel Martinez");
        studentList.add("Olivia Anderson");
        studentList.add("James Thomas");

        // Copy values from studentList to graduateStudentList
        graduateStudentList.addAll(studentList);

        // Iterate through graduateStudentList and print each graduated student
        System.out.println("Graduate Students:");
        for (String student : graduateStudentList) {
            System.out.println(student);
        }
    }
}
