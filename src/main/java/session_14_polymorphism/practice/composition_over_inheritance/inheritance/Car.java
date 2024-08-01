package session_14_polymorphism.practice.composition_over_inheritance.inheritance;

//nu prea raspunde la intrebare Car si a Engine - composition se potriveste mai bine
public class Car extends Engine {

    //vrem sa facem ovverride la metoda start din clasa Engine

    @Override
    void start() {
        System.out.println("Car is moving");
    }
}