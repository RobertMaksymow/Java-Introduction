public class BreakAndContinueStatement {
    public static void main(String[] args) {
        //Jumping statement
        for (int i = 1; i <= 15; i++) {
            if(i == 7){
                continue;
            }
            if(i > 11){
                break;
            }
            System.out.println("value is: " + i);
        }
    }
}
