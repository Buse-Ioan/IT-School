package session_11_inheritance_encapsulation.practice;

public class Appliance {

    String brand = "Generic";

    Appliance() {
        System.out.println("Appliance is created");
    }

    void function() {
        System.out.println("Appliance is functioning");
    }
}

class Refrigerator extends Appliance {

    String brand= "Arctic";

    Refrigerator () {    //cream un constructor
        super();         // calls the constructor of the parent class
        System.out.println("Refrigerator is created");
    }

    void displayBrand() {
        System.out.println("Refrigerator brand: " + brand);
        System.out.println("Appliance brand: " + super.brand);  // prin super ne referim ce am definit in clasa parinte
    }

    void function() {
        System.out.println("Refrigerator is cooling");
    }

    void work() {
        super.function();  // apelarea metodei fucntion din clasa parinte (calls function() from Appliance
        function();
    }
}

class TestRefrigerator {
    public static void main(String[] args) {
        Refrigerator refrigerator = new Refrigerator();
        refrigerator.displayBrand();  //vrem sa vedem cele 2 prop din clasa parinte
        refrigerator.work();
    }
}