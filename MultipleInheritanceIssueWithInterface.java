interface DemoInterface1 {
    void show1();

    default void show2() {
        System.out.println("In show 2");
    }
}

interface DemoInterface2 {

    default void show2() {
        System.out.println("In NEW show 2");
    }
}

class DemoClass implements DemoInterface1, DemoInterface2 {
    public void show1() {
        System.out.println("In show 1 Democlass");
    }

    @Override
    public void show2() {
        DemoInterface2.super.show2();
    }
}

public class MultipleInheritanceIssueWithInterface {
    public static void main(String[] args) {
        DemoInterface1 obj = new DemoClass();
        obj.show1(); // In show 1 Democlass
        obj.show2(); // In NEW show 2
    }
}
