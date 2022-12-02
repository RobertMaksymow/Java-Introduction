class Calculator {
    public void add(int i, int j) {
        System.out.println(i + j);
    }

    public void add(int i, int j, int k) {
        System.out.println(i + j + k);
    }

    public void add(double i, double j) {
        System.out.println(i + j);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        obj.add(5, 2);
        obj.add(4, 3, 5);
        obj.add(4.5, 3.8);
    }
}
