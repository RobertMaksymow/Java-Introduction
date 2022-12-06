class D {
    final int i = 0; // 'final' makes variable behaving like constant

    public D() {
        // i = 10; // causing error if int i is 'final'.
        // i = 4; //If we would not assign value at int, we can do that in constructor,
        // even if 'final'
    }
}

class E {
    final public void show() {
        System.out.println("in E show");
    }
}

class F extends E {
    // public void show(){ // getting error as we can't use the same final method
    // from E
    // System.out.println("in E show");
    // }
}

public class FinalKeyword {
    public static void main(String[] args) {
        D obj = new D();
        System.out.println(obj.i);
    }
}
