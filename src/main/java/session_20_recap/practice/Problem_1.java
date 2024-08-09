package session_20_recap.practice;

//Given a sentence, count how many words in the sentence have more than three characters.
// You can consider a word to be a sequence of characters separated by spaces.

public class Problem_1 {
    public static void main(String[] args) {
        String sentence = "Welcome all of java junior developers!";

        String[] words = sentence.split(" ");

        int count = 0;

        for (String word : words) {
            if (word.length() > 3) {
                count++;
            }
        }

        System.out.println("Number of words with more than three characters: " + count);
    }
}