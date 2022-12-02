public class SelectionTernary2 {
    public static void main(String[] args) {
        int income = 120_000;
        String whichClass = income > 100_000 ? "First Class" : "Economy Class";
        System.out.println(whichClass);
    }
}
