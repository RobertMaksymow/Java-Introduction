class Calc{
    int num1;
    int num2;
    int result;

    public void performAdd(){
        result = num1 + num2;
    }
}

public class ObjectAndClasses {
    public static void main(String[] args) {
        Calc obj = new Calc(); // knows something and does something - main method
        obj.num1 = 3;
        obj.num2 = 5;

        obj.performAdd();

        System.out.println(obj.result);
    }
}
