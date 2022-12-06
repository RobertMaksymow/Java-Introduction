interface Ccc {
    void show();
}

// Lambda Expression is only possible with Functional Interfaces (F.I. has only
// one method)
public class FunctionalInterface {
    public static void main(String[] args) {
        Ccc obj = () -> System.out.println("I'm Lambda Expression");
        obj.show(); // I'm Lambda Expression
    }
}
