abstract class Human { // abstract class
    // public abstract void eat(){ //abstract method
    // System.out.println("om nom nom");
    // }

    public void walk() {

    }
}

class Behaviour {
    public void actLoud(Integer i) {
        System.out.println("SHOUT NUMBER " + i + "!");
    }

    public void actLoud(Double i) { // Method overloading
        System.out.println("SHOUT NUMBER " + i + "!");
    }

    // Number is superclass, and also Abstract and is being extension for Integer or
    // Double (is more generic)
    public void actLoud(Number i) { // Method overloading
        System.out.println("SHOUT NUMBER " + i + "!");
    }
}

class Man extends Human { // concrete class
    public void eat() { // if we have class that extends abstract parent class we have to write the same
                        // methods.

    }
}

public class AbstractKeyword {
    public static void main(String[] args) {
        Human obj = new Man(); // reference Human, but object Man

        Behaviour obj1 = new Behaviour();
        obj1.actLoud(5);
        obj1.actLoud(6.7);

    }
}
