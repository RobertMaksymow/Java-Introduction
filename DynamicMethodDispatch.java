class A {
    public void show() {
        System.out.println("in A");
    }
}

class B extends A {
    public void show() { // method overriding
        System.out.println("in B");
    }
}

class C extends A {
    public void show() { // method overriding
        System.out.println("in C");
    }
}

public class DynamicMethodDispatch {
    // compile time polimorphism, runtime polimorphism
    public static void main(String[] args) {
        A obj1 = new B(); // type class A reference, but using class B - runtime polimorphism
        obj1.show(); // will show 'in B'

        obj1 = new C();
        obj1.show(); // will show 'in C' //Dynamic method dispatch
    }
}
