public class Array2D {
    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4 };
        int b[] = { 5, 6, 7, 8 };
        int c[] = { 9, 10, 11, 12 };
        System.out.println(a[2]); // 3

        // Multidimensional Array
        int d[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 0, 1, 2 }
        };
        System.out.println(d[2][0]); // 9

        for (int i = 0; i < d.length; i++) { // counting rows
            for (int j = 0; j < d[i].length; j++) { // counting columns
                System.out.print(" " + d[i][j]);
            }
            System.out.println(); // 1 2 3 4
                                  // 5 6 7 8
                                  // 9 0 1 2
        }

        // Jagged Array
        int e[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7 },
                { 9, 0, 1, 2, 8, 3 }
        };
        for (int i = 0; i < e.length; i++) { // counting rows
            for (int j = 0; j < e[i].length; j++) { // counting columns
                System.out.print(" " + e[i][j]);
            }
            System.out.println(); // 1 2 3 4
                                  // 5 6 7
                                  // 9 0 1 2 8 3
        }
    }
}
