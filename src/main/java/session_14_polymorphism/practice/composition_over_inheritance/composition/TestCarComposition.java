package session_14_polymorphism.practice.composition_over_inheritance.composition;

public class TestCarComposition {

    //implementare
    public static void main(String[] args) {
        Engine carEngine = new Engine(); //cream un motor de masina
        Car car = new Car(carEngine);
        car.start();  //pornim masina
    }
}