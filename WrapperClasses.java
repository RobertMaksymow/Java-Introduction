public class WrapperClasses {
    public static void main(String[] args) {
        int i = 5; // Primitive datatype
        Integer ii = new Integer(5); // Wrapper class
        Integer iii = new Integer(i); // Boxing / Wrapping - Primitive datatype inside an object

        int j = ii.intValue(); // Unboxing / Unwrapping

        Integer value = i; // Autoboxing
        int k = value; // Autounboxing

        String str = "123";
        int n = Integer.parseInt(str);
        System.out.println(n);

    }
}
