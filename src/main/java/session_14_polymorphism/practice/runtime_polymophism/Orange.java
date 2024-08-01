package session_14_polymorphism.practice.runtime_polymophism;

public class Orange extends Fruit{

    // virtual methods

    @Override
    public String taste() {
        return "orange is sour";  // implementare
    }

    @Override
    public String colour() {
        return "orange is orange";
    }
}