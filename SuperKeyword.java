class A {
    public A() { // constructor
        System.out.println("In A");
    }

    public A(int i) { // constructor
        System.out.println("In A int");
    }

}

class B extends A {
    public B() { // constructor
        // Every constructor in subclass will have by default a method called super().
        // It will call a constructor of the super class (parent)
        // super(5); // is here by default. Invisible.
        System.out.println("In B");
    }

    public B(int i) { // constructor
        // super(i); // is here by default. Invisible.
        System.out.println("In B int");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        A obj1 = new A(); // will call constructor A
        B obj2 = new B(); // Will call constructor A and B

        B obj3 = new B(5); // Will call constructor A and B int. If we want to call A int, we have to pass
                           // a value to super()
    }
}
