interface Demo5 {
    int num = 8; // We can define variable in Interface, and it became a Constant. we can't
                 // modify it. 'Final' by default.

    void abc();

    static void show() { // From Java 8-we don't have to create object to call method with static within
                         // interface
        System.out.println("hello");
    }
}

public class StaticMethodInInterface {
    public static void main(String[] args) {
        Demo5.show();
    }
}
