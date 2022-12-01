import java.util.Date;

class Main{
    // public static void main(String args[]){
    //     System.out.println("Hello, World!"); 
    // }
    public static void main(String[] args){
        String message = getString();
        System.out.println(message); 
        byte age = 30;
        Date now = new Date();
        System.out.print(now);
    }
    public static String getString(){
        return "Hello from return";
    }

}