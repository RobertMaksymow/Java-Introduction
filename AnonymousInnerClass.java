class Anon {
    public void show() {
        System.out.println("in Anon show");
    }
}

// If the only purpose of the class is to overload the method (to print "I'm the
// best"), like in this example Anon2
// We can create anonymous class while creating new object, to get the same
// effect
class Anon2 extends Anon {
    public void show() {
        System.out.println("I'm the best");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {
        Anon obj = new Anon2() {
            public void show()
            // Anonymous class below, only in this scope.
            {
                System.out.println("I'm the best 2");
            }
        };
        obj.show();
    }

}
