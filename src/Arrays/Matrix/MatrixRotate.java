package Arrays.Matrix;

public class MatrixRotate {

    //rotating matrix by 90
    public static void rotatingMatrix() {
        // Test Case 1
        //input > int arr[][] = {{1, 2, 3, 4},
        //                {5, 6, 7, 8},
        //                {9, 10, 11, 12},
        //                {13, 14, 15, 16}};
        //  output>
        //5 1 2 3
        //9 10 6 4
        //13 11 7 8
        //14 15 16 12.


        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};

        //Test Case 2

        // Test Case 2
        // int arr2[][] = {{1, 2, 3},
        //                {4, 5, 6},
        //                {7, 8, 9}
        //        };
        //  Output >
        //   4 1 2
        //   7 5 3
        //   8 9 6
        //   end
        int[][] arr2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        int top = 0, bottom = arr.length - 1;
        int left = 0, right = arr[0].length - 1;

        int top1 = 0, bottom1 = arr2.length - 1;
        int left1 = 0, right1 = arr2[0].length - 1;
        System.out.println("------- Test Case 1 ----------");
        clockwiseRotate(arr, top, bottom, left, right);
        System.out.println("------- Test Case 2 ----------");
        clockwiseRotate(arr2, top1, bottom1, left1, right1);


    }

    private static void clockwiseRotate(int[][] mat, int top, int bottom, int left, int right) {

        int prev, curr;

        /*
        left - Starting row index
        right - ending row index
        top - starting column index
        bottom - ending column index
        i - iterator
        */


        // Print rotated matrix
        for (int i = 0; i < right; i++) {
            for (int j = 0; j < top; j++)
                System.out.print(mat[i][j] + " ");
            System.out.print("\n");
        }
    }
}
