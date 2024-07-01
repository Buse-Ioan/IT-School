package session_6_core_java_apis.challenge;

//8. Inserting at Index
//Description: Write a Java program that inserts a given string into another string at a specified index using the StringBuilder class.

public class Challenge_8_StringInsertion {

    public static String insertStringAt(String original, String toInsert, int index) {
        // Create a StringBuilder object with the original string
        StringBuilder sb = new StringBuilder(original);

        // Insert the given string at the specified index
        sb.insert(index, toInsert);

        // Convert StringBuilder back to String and return
        return sb.toString();
    }

    public static void main(String[] args) {
        String original = "Ioan";
        String toInsert = " Buse";
        int index = 4;

        String result = insertStringAt(original, toInsert, index);

        System.out.println("Original String: " + original);
        System.out.println("String after insertion: " + result);
    }
}