package Arrays.Matrix;

import java.util.Arrays;

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

    private static void clockwiseRotate(int[][] arr, int top, int bottom, int left, int right) {

        int prev, curr;

        /*
        left - Starting row index
        right - ending row index
        top - starting column index
        bottom - ending column index
        i - iterator
        */
        //rotate first row
        //print the top
        // output > 1, 2, 3, 4, 5
        prev = arr[top + 1][left];
        //shift to top
        for (int i = left; i <= right; i++) {
            curr = arr[top][i];
            arr[top][i] = prev;
            prev = curr;
        }
        top++;
        if (top > bottom) {
            return;
        }
        // move to right
        for (int i = top; i <= bottom; i++) {
            curr = arr[i][right];
            arr[i][right] = prev;
            prev = curr;


        }
        right--;
        if (left > right) {
            return;
        }

        // move bottom
        for (int i = right; i >= left; i--) {
            curr = arr[bottom][i];
            arr[bottom][i] = prev;
            prev = curr;
        }
        bottom--;
        if (top > bottom) {
            return;
        }

        //move to the left column
        //output> 13 14 15 16
        for (int i = bottom; i >= top; i--) {

            curr = arr[i][left];
            if (curr != prev) {
                arr[i][left] = prev;
                prev = curr;

            }

        }
        left++;

        clockwiseRotate(arr, top, bottom, left, right);
        // Print rotated matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++)
                System.out.print(arr[i][j] + " ");
            System.out.print("\n");
        }
    }

    /*
     * n-place rotate matrix by 180 degrees  Given a square matrix, rotate the matrix by 180 degrees in a
     *  clockwise direction. The transformation should be done in-place
     * in quadratic time.
     * */
    public static void rotateBy180Degrees() {
        int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        int[][] arr1 = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};

        System.out.println("------------ Even -------------------");
        rotateBy180ReverseOrder(arr);
        System.out.println("------------ Odd -------------------");
        rotateBy180ReverseOrder(arr1);

    }

    // Input:
    //
    //1   2   3   4
    //5   6   7   8
    //9   10  11  12
    //13  14  15  16
    //
    //Output:
    //
    //16  15  14  13
    //12  11  10  9
    //8   7   6   5
    //4   3   2   1
    // .
    //Time complexity
    // O(N*2)
    // Space Complexity
    // O(1)
    // In-place rotate it by 180 degrees in an anti-clockwise direction
    private static void rotateBy180ReverseOrder(int[][] arr) {
        // best case
        if (arr == null || arr.length == 0) {
            return;
        }
        int n = arr.length;

        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[n - i - 1][n - j - 1];
                arr[n - i - 1][n - j - 1] = temp;

            }
        }

        if (n % 2 == 1) {
            for (int j = 0; j < n / 2; j++) {
                int temp = arr[n / 2][j];
                arr[n / 2][j] = arr[n / 2][n - j - 1];
                arr[n / 2][n - j - 1] = temp;
            }
        }

        for (int[] r : arr) {
            System.out.println(Arrays.toString(r));
        }


    }

    public static void rotate90Clockwise() {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        rotate90Clockwise(arr);


    }

    private static void rotate90Clockwise(int[][] arr) {
        //input > int [][] arr= [1,2,3]
        //                      [4,5,6]
        //                      [7,8,9]

        //output>               [7,4,1]
        //                      [8,5,2]
        //                      [9,6,3].

        int N = arr.length;
        for (int i = 0; i < N / 2; i++) {
            for (int j = 0; j < N - i - 1; j++) {

                // rotate clock wise

                int temp = arr[i][j]; // first > 1
                arr[i][j] = arr[N - 1 - j][i]; // 3-1-0>[2][0] > 7
                arr[N - 1 - j][i] = arr[N - 1 - i][N - 1 - j]; // 3-1-0[2] | 3-1-0 |[2] >9
                arr[N - 1 - i][N - 1 - j] = arr[j][N - 1 - i]; //arr[0][2]
                arr[j][N - 1 - i] = temp; // arr[0][2]= arr[0][0];


            }
        }

        System.out.print("[");
        for (int i = 0; i < N; i++) {
            System.out.print("{");
            for (int j = 0; j < N; j++) {

                System.out.print(" " + arr[i][j] + " ");

            }
            System.out.print("}");
            System.out.println();

        }
        System.out.print("]");
    }
//input > int[][] arr = {{1, 2, 3, 4},
//                {5, 6, 7, 8},
//                {9, 10, 11, 12},
//                {13, 14, 15, 16}};
//output > 13 9 5 1
//         14 10 6 2
//         15 11 7 3
//         16 12 8 4                 .
    public static void rotateMatrix90ClockwiseMethod2() {
        int[][] arr = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        rotateMatrix90ClockwiseMethod2(arr);
    }

    /*
     * 1. This approach is made from a pattern after rotating the matrix by 90
     * - consider
     * => [ {00, 01,02}
     *    {10, 11, 12}
     *    {20, 21, 22}]
     *
     * =>  [ { 20, 10, 00},
     *      { 21, 11, 01},
     *      { 22, 12, 02}]
     * => after rotating 90 degrees clockwise
     * 20, 10, 00 - current_row_index = 0 i= 2, 1, 0
     * 21, 11, 01 - current_row_index = 1 i= 2, 1, 0
     * 22, 12, 02 - current_row_index = 2 i= 2, 1, 0
     *
     * observation
     * for every row, decreasing row index i there is a constant column index j
     * such that j= current_row_index
     * */
    private static void rotateMatrix90ClockwiseMethod2(int[][] arr) {
        int n = arr.length;
        System.out.print("[");
        for (int j = 0; j < n; j++) {

            for (int i = n - 1; i >= 0; i--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();


        }
        System.out.print("]");
    }
}
