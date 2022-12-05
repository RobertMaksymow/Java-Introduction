class CalculatorBasic { // Superclass in Java/ Parentclass / Baseclass
    public int add(int i, int j) {
        return i + j;
    }
}

// Single level of Inheritance: Calc > CalcAdv
class CalculatorAdv extends CalculatorBasic { // Subclass in Java, Childclass, Derivedclass
    public int subtrack(int i, int j) {
        return i - j;
    }
}

// Multi level of Inheritance: Calc > CalcAdv > CalcVeryAdv
class CalculatorVeryAdv extends CalculatorAdv {
    public int multiplication(int i, int j) {
        return i * j;
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        CalculatorBasic c = new CalculatorBasic();
        int result = c.add(4, 5);
        System.out.println(result);

        CalculatorAdv c1 = new CalculatorAdv();
        int result1 = c1.add(3, 7);
        int result2 = c1.subtrack(6, 2);
        System.out.println(result1);
        System.out.println(result2);

        CalculatorVeryAdv c2 = new CalculatorVeryAdv();
        int result3 = c1.add(4, 7);
        int result4 = c2.multiplication(4, 5);
        System.out.println(result3);
        System.out.println(result4);
    }
}
