import java.util.Arrays;

public class ArraysMultiDimensional {
    public static void main(String[] args) {
        int[][] numbers = new int [2][3]; // creates array 2 rows by 3 columns
        numbers[0][0] = 1;
        System.out.println(Arrays.toString(numbers)); // [[I@7344699f, [I@6b95977]
        System.out.println(Arrays.deepToString(numbers)); // [[1, 0, 0], [0, 0, 0]]

        int[][] numbers2 = {{1,2,3},{4,5}};
        System.out.println(Arrays.deepToString(numbers2)); // [[1, 2, 3], [4, 5]] 
    }
}
