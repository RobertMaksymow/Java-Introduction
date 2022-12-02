import java.util.Scanner;

public class ReadingInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Type your age: ");
        // byte age = scanner.nextByte();
        // System.out.println("You are " + age);

        System.out.print("Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("You are " + name);
    }
}
