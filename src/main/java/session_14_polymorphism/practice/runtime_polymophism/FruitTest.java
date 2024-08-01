package session_14_polymorphism.practice.runtime_polymophism;

public class FruitTest {

    //facem uz de implementarile pe care le avem pana acum
    public static void main(String[] args) {
        printFruitDetails(new Apple());  //instanta apple
        printFruitDetails(new Orange());  //instanta orange

    }

    // o metoda pe care sa o apelam din main - metoda statica
    // primeste ca si paramentru clasa Parinte-"Fruit"
    public static void printFruitDetails(Fruit fruit) {
        System.out.println("Taste: " + fruit.taste());
        System.out.println("Colour: " + fruit.taste());
    }
}