interface Aaa {
    void show();
}

public class AnonymousInnerClassWithInterface {
    public static void main(String[] args) {
        Aaa obj = new Aaa() {
            public void show() {
                System.out.println("dupa blada");
            }
        };
        obj.show();
    }
}
