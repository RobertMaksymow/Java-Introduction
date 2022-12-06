// We can't extends more than one class. But what we can do is to use interface, to get some
// functionalites and still extend class on other class.
// ie. class Pen extends ABC implements Writer{}
// Interface is seen as 'abstract class', so we can use abstract methods. We can't define new methods, we can only declare abstract methods.
// Any methods created inside Interface are 'abstract and public', so we can skip those words.
// Using abstract we can achieve mulitple inheritance (by implementing mulitple interfaces), because we can't extends mulitple classes.
// We can't crearte an object of Interface, we can only create a reference of it: Writer pencil = new Pencil();
// We can create a reference of interface (Writer pencil) and object of a class (new Pencil())

interface Writer {
    public abstract void write();
}

class Pen implements Writer {
    public void write() {
        System.out.println("Im a Pen");
    }
}

class Pencil implements Writer {
    public void write() {
        System.out.println("Im a Pencil");
    }
}

class Kit {
    public void doSomething(Writer item) {
        item.write();
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        Kit kit = new Kit();
        // Writer pen = new Pen();
        Writer pencil = new Pencil();

        kit.doSomething(pencil);
    }
}
