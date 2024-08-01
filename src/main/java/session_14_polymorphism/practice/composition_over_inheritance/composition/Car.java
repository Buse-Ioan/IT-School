package session_14_polymorphism.practice.composition_over_inheritance.composition;

public class Car {

    // atribut engine
    // HAS-A Car - Engine   -uz de incapsulare
    private Engine engine;

    //ca sa avem un outcome avem nevoie de un constructor
    public Car(Engine engine) {
        this.engine = engine;
    }

    //ca sa pornim masina avem nevoie de un motor
    void start() {
        engine.start();
    }
}