// BLUEPRINT of THE CLASS
class Employer {
    int employerId;
    int salary;
    static String ceo; // WITHOUT STATIC it will display THG and CHUDY sp o.o, with STATIC it will be
    // CHUDY sp o.o in both cases

    static { // static block will be exected when you load a class - just once. all the same
             // for all the objects
        ceo = "Mark";
        System.out.println("In static");
    }

    public Employer() { // default Class Constructor - we predefine values // Executed every time when
                        // you create new object
        employerId = 1;
        salary = 3000;
        ceo = "Larry";
        System.out.println("In constructor");
    }

    public void show() {
        System.out.println(employerId + " : " + salary + " : " + ceo);
    }
}

// CLASS AND OBJECTS
public class StaticDemo {
    public static void main(String[] args) {
        Employer max = new Employer();
        max.employerId = 7;
        max.salary = 5000;
        max.ceo = "THG";
        Employer.ceo = "THG2"; // we don't need objects

        Employer chudy = new Employer();
        chudy.employerId = 22;
        chudy.salary = 4000;
        chudy.ceo = "Chudy sp o.o";

        Employer.ceo = "Nowy"; // depends is it with static we have class name instead specific object. Good if
                               // we want to override some data.

        max.show();
        chudy.show();
    }
}
