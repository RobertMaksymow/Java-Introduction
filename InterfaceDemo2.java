interface Something {
    void show();
}

class Implimentor implements Something {
    public void show() {
        System.out.println("Anything...");
    }
}

public class InterfaceDemo2 {
    public static void main(String[] args) {
        // Something obj = new Something(); // we can't make new object based on
        // Interface, we can only use the reference part (left)
        // We have to create class that implements Interface (Implimentor)
        Something obj = new Implimentor();
        obj.show(); // Anything...
    }
}
