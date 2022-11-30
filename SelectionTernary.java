public class SelectionTernary {
    public static void main(String[] args) {
        int i=8;
        int j=0;
        // If Statement
        if(i>6){
            j=1;
        } 
        else {
            j=2;
        }
        System.out.println(j); // 1
        
        // Ternary Operator ->  condition ? true-doThis : false-doThis
        j = i>6 ? 4 : 5;
        System.out.println(j); // 4

    }
}
