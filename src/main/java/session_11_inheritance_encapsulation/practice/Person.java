package session_11_inheritance_encapsulation.practice;

// min 8:53

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    // definim un getter
    public String getFirstName() {
        return firstName; //ne  ajuta sa intoarcem valoarea oricare ar fi ea
    }

    // setter
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Age cannot be negative or zero");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}