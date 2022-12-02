import java.text.NumberFormat;

public class NumbersFormatting {
    public static void main(String[] args) {
        NumberFormat currency = NumberFormat.getCurrencyInstance(); // Abstract class has .getCurrencyInstance 'factory'
                                                                    // method / halfbaked cake. Creates new objects.
        String result = currency.format(1234567.891);
        System.out.println(result); // £1,234,567.89

        NumberFormat percent = NumberFormat.getPercentInstance();
        String result2 = percent.format(0.1);
        System.out.println(result2); // 10%

        // Method chaining
        String result3 = NumberFormat.getPercentInstance().format(0.05);
        System.out.println(result3);

    }
}
