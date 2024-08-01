package session_14_polymorphism.practice.object_vs_referance;

public class TestVehicle {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle truck = new Truck();

        //ctrl +alt+b - go to the implementation of the metod
        System.out.println(car.fuelType());  //cu ajutorul referinte car am acces la prop
        System.out.println(truck.fuelType());

        //explicit casting
        Car anotherCar = (Car)car;
    }
}