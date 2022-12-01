//see notes Word
class Calc{
    int num1;  
    int num2;
    int result;

    public Calc(){
        num1 = 5
        num1 = 5
    }
    public Calc(int n){
       num1 = n
       num2 = n
    }
    public Calc(double k){
       num1 = (int) k;   //casting  (9), cut 0.5
       
    }
    public Calc(int n, double k){
       num1 = (int) k; //casting  (9), cut 0.5
       num2 = n
    }



}

public class ObjectAndClasses {
    public static void main(String[] args) {
        Calc obj = new Calc(7); 

        System.out.println(obj.num1);  // 7
    }
}
