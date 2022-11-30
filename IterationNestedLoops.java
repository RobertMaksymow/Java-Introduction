public class IterationNestedLoops {
    public static void main(String[] args) {
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j < 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println(); // prints new line
        }
    }
}
// 1 2 3 4 
// 1 2 3 4 
// 1 2 3 4 
// 1 2 3 4 