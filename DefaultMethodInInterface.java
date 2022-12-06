interface Demo {
    // Abstract Method can be only one
    void testMethod1();

    // default method can me more
    default void testMethod2() {
        System.out.println("inside test method 2");
    }
}

class DemoImplementation implements Demo {
    public void testMethod1() {
        System.out.println("inside test method 1");
    }

    public void testMethod2() { // Method Overloading
        System.out.println("in New Show");
    }
}

public class DefaultMethodInInterface {
    public static void main(String[] args) {
        Demo obj = new DemoImplementation();
        obj.testMethod1();
        obj.testMethod2();

    }
}
