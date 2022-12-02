import java.util.Scanner;

public class IterationWhile2 {
    public static void main(String[] args) {
        // Takes input from terminal
        Scanner scanner = new Scanner(System.in);
        String input = "";
        while (!input.equals("quit")) {
            System.out.print("Input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }
    }
}
