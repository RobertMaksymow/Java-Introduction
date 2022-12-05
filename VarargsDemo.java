class Calculator2 {
    public int add(int i, int j) {
        return i + j;
    }

    // To pass multiple parameters without defining special constructors for each
    // option:
    public int add2(int... n) { // Array {4, 5, 8, 3, 6} // Variable length arguments
        int sum = 0;
        for (int i : n) {
            sum = sum + i;
        }
        return sum;
    }
}

public class VarargsDemo {
    public static void main(String[] args) {
        Calculator2 obj = new Calculator2();
        int result = obj.add(4, 5);
        System.out.println(result);

        int result2 = obj.add2(4, 5, 8, 3, 6);
        System.out.println(result2);
    }
}
