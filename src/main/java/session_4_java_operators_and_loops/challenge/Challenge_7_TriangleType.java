package session_4_java_operators_and_loops.challenge;

//7. Write a Java program that determines the type of a triangle based on its sides.
// Declare three variables sideOne, sideTwo and sideThree to represent the sides of the triangle.
// Use the ternary operator to determine and print whether the triangle is "Equilateral", "Isosceles", or "Scalene".

public class Challenge_7_TriangleType {
    public static void main(String[] args) {
        int sideOne = 5;
        int sideTwo = 5;
        int sideThree = 5;

        String triangleType = (sideOne == sideTwo && sideTwo == sideThree) ? "Equilateral" : (sideOne == sideTwo || sideTwo == sideThree || sideOne == sideThree) ? "Isosceles" : "Scalene";

        System.out.println("The triangle is: " + triangleType);
    }
}