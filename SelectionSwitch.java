public class SelectionSwitch {
    public static void main(String[] args) {
        int n = 2;
    
        //If Statement
        if(n == 1){
            System.out.println("One");
        }
        else if(n == 2){
            System.out.println("Two");
        }
        else{
            System.out.println("Four");
        }

        // Switch Statement (supports Characters and Strings, don't supports doubles)
        switch (n) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("No number matched");
                break;
        }
    }
}
