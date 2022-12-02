public class SelectionIf {
    public static void main(String[] args) {
        int temp = 32;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink water");
        } else if (temp > 20 && temp <= 30) {
            System.out.println("Beautiful Day");

        } else {
            System.out.println("It's a cold day");
            ;
        }

        int income = 120_000;
        boolean hasHighIncome = (income > 100_000); // will evaluate to true or false, instead writing if, else
        System.out.println("Has high income: " + hasHighIncome);
    }
}
