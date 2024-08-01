package session_11_inheritance_encapsulation.challenge.challenge_1_2_3_4_5;

//1.Create an Animal class with sound() method that prints to console “animal makes sounds”

public class Animal {

    public void sound() {
        System.out.println("animal makes sounds");
    }

    public static void main(String[] args) {
        //Create an instance of Animal
        Animal animal = new Animal();

        //Call the sound method
        animal.sound();
    }
}

//2.Create a Dog class that extends Animal and overrides sound() method; dogs make a particular sound, so we want to print “bark”, in this case

// Child class Dog that extends Animal
class Dog extends Animal {

    // Overriding the sound method to print "bark"
    @Override
    public void sound() {
        System.out.println("bark");
    }

    // Main method to test the Dog class
    public static void main(String[] args) {
        //Create an instance of Dog
        Dog dog = new Dog();

        //Call the sound method
        dog.sound(); // prints "bark"
    }
}

//3. Create a Cat class that extends Animal and overrides sound() method, and in this case, we want to print in our method “meow”

// Child class Cat that extends Animal
class Cat extends Animal {

    // Overriding the sound method to print "meow"
    @Override
    public void sound() {
        System.out.println("meow");
    }

    // Main method to test the Cat class
    public static void main(String[] args) {
        // Create an instance of Cat
        Cat cat = new Cat();

        //Call the sound method
        cat.sound();
    }
}

//4.Create a Wolf class that extends Animal, and overrides sound() method, and print “howl”

// Child class Cat that extends Animal
class Wolf extends Animal {

    // Overriding the sound method to print "howl"
    @Override
    public void sound() {
        System.out.println("howl");
    }

    // Main method to test the Wolf class
    public static void main(String[] args) {
        // Create an instance of Wolf
        Wolf wolf = new Wolf();

        // Call the sound method
        wolf.sound(); //prints "howl
    }
}