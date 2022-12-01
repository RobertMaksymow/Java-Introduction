import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {
        int[] numbers = new int [5]; // creates array with length 5
        numbers[0] = 1;
        numbers[1] = 2;
        System.out.println(numbers); // [I@7344699f address of that object in memory
        System.out.println(Arrays.toString(numbers)); // [1, 2, 0, 0, 0]

        int[] numbers2 = {2,3,4,5,1,3};
        System.out.println(numbers2); // [I@6b95977
        System.out.println(numbers2.length); // 6
        System.out.println(Arrays.toString(numbers2)); // [2, 3, 4, 5, 1, 3]
        
        Arrays.sort(numbers2);
        System.out.println(Arrays.toString(numbers2)); // [1, 2, 3, 3, 4, 5]
    }
}
