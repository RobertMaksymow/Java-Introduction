public class MathBasics {
    public static void main(String[] args) {
        int result = Math.round(1.1F);
        System.out.println(result);

        int result2 = (int)Math.ceil(1.1F);
        System.out.println(result2);

        int result3 = (int)Math.floor(1.1F);
        System.out.println(result3);

        int result4 = Math.max(1, 2);
        System.out.println(result4);

        double result5 = Math.random(); //random return double and value between 0 - 1
        System.out.println(result5); // 0.4874889616615232

        int result6 = (int)Math.round(Math.random() * 100); // generate random number, and round it. Explicit casting into integer.
        // int result6 = (int) (Math.random() * 100)) //we can skip .round() if into integer
        System.out.println(result6); // 45
    }
}
