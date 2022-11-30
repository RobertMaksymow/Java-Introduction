public class SelectionDemo{
    /*
     * if / switch / ternary
     */
    public static void main(String[] args) {
        int n = 5;

        if(n==0){
            System.out.println("Hello");
            System.out.println("World");
        }
        else if(n%2==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }
    }
}