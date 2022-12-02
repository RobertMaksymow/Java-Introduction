import java.util.Scanner;

public class IterationWhile3 {
    public static void main(String[] args) {
        // Takes input from terminal
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            if (input.equals("quit")) {
                break;
            }
            System.out.println(input);
        }
    }
}
