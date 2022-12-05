class Outer { // Outer.class
    int a = 1; // member variable

    public void show() { // member method
        System.out.println("Int A: " + a);
    }

    // class Inner { //Outer$Inner.class
    static class Inner {
        public void display() {
            System.out.println("In display method");
        }
    }
}

public class InnerClassDemo { // InnerClassDemo.class
    // we can create variables, methods and classes here
    public static void main(String[] args) {
        Outer obj = new Outer();
        obj.show();

        // Outer.Inner obj1 = obj.new Inner(); // if we won't use static at Inner class
        Outer.Inner obj1 = new Outer.Inner(); // if we use static at Inner class
        obj1.display();
    }

}
