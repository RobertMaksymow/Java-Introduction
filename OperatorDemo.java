public class OperatorDemo {

    /*
     * Arithmetic +, -, *, / ,%
     * Bitwise
     * Relational
     * Logical
     */
    public static void main(String[] args) {
        int m=6, n=4;
        int r1 = m + n;
        int r2 = m-n;
        int r3 = m * n;
        double r4 = (double)m / n;
        int r5 = m % n;

        int a=4, b=5;
        int c=0, d=0;
        a = a + b; // a += b
        a++; //5
        c = ++b; // 6 .  // pre increment
        d = a++; // 10 .  // post increment

        System.out.println(r1); // 10
        System.out.println(r2); // 2
        System.out.println(r3); // 24
        System.out.println(r4); // 1.5
        System.out.println(r5); // 2
        System.out.println(a);  // 9
        System.out.println(c);  //6
        System.out.println(d);  //10
    }
}
