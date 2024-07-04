package session_9_arrays.challenge;

//1. Create a shopping list with Array and print the values

public class Challenge_1_ShoppingList {
    public static void main(String[] args) {
        String[] shoppingList= {"Milk", "Bread", "Eggs", "Butter"};

        System.out.println("Shopping List:");
        for (String item : shoppingList) {
            System.out.println(item);
        }
    }
}
