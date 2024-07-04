package session_9_arrays.challenge;

//2. Create a wishlist for christmas with ArrayList and print the values

import java.util.ArrayList;

public class Challenge_2_ChristmasWishlist {
    public static void main(String[] args) {
        ArrayList<String> wishlist = new ArrayList<>();

        wishlist.add("New Phone");
        wishlist.add("Laptop");
        wishlist.add("Bicycle");
        wishlist.add("Watch");
        wishlist.add("Books");

        System.out.println("Christmas Wishlist:");
        for (String item : wishlist) {
            System.out.println(item);
        }
    }
}
