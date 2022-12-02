class Calculator {
    int num1;
    int num2;
    String doOperation;

    public Calculator() { // constructor
        num1 = 0;
        num2 = 0;
        doOperation = "Nothing";
    }

    public Calculator(int i) { // constructor
        num1 = i;
        num2 = 0;
        doOperation = "Nothing";
    }

    public Calculator(int i, int j) { // constructor
        num1 = i;
        num2 = j;
        doOperation = "Nothing";
    }

    public Calculator(int i, int j, String operation) { // constructor
        num1 = i;
        num2 = j;
        doOperation = operation;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator(4, 6, "add"); // will call last default constructor (3 args). Constructor
                                                      // Overloading.

    }
}
