package session_6_Core_Java_APIs.practice;

public class EqualsStringExample {

    public static void main(String[] args) {
        String colour1 = "Blue";
        String colour2 = "bluE";

        System.out.println(colour1.equals(colour2));  //false
        System.out.println(colour1.equalsIgnoreCase(colour2));  //true
        System.out.println(colour1.toLowerCase().equals(colour2.toLowerCase()));  //true
    }
}