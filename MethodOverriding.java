class A {
    public void show() {
        System.out.println("in A");
    }
}

class B extends A {
    // @Override
    public void show() { // if there was no show() method in class B, it would call method show() in
                         // class A. But
                         // because we have method show in B that's why it's overriding method show() in
                         // A. Child class method will override a parent class.
        super.show(); // using super will call show() at class A. Check super Keyword to find out why.
                      // (Parent class object)
        System.out.println("in B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        B obj1 = new B();
        obj1.show();
    }
}
