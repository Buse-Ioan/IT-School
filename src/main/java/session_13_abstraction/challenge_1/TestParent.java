package session_13_abstraction.challenge_1;

public class TestParent {

    public static void main(String[] args) {
        // Create an object of the first and second subclass and call the message method
        SubclassOne subclassOne = new SubclassOne();
        SubclassTwo subclassTwo = new SubclassTwo();

        subclassOne.message();
        subclassTwo.message();
    }
}