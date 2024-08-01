package session_11_inheritance_encapsulation.challenge.challenge_1_2_3_4_5;

public class TestAnimal {
    public static void main(String[] args) {
        // Creating an object of Dog and calling sound()
        Animal dog = new Dog();
        dog.sound();  // Output: bark

        // Creating an object of Cat and calling sound()
        Animal cat = new Cat();
        cat.sound();  // Output: meow

        // Creating an object of Wolf and calling sound()
        Animal wolf = new Wolf();
        wolf.sound();  // Output: howl
    }
}
