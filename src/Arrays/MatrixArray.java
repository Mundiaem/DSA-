package Arrays;

/**
 * created with love by mundiaem
 * created on 17/06/2022
 * Time: 22:47
 * ⚡  - DSA-
 */

public class MatrixArray {
    public static void matrix() {
        //columns > subjects > maths, English, Kiswahili
        // rows > students
        // > Michael,Edwin
        int[][] m = {{0, 9, 8, 7, 6, 5, 4, 3, 2, 1},
                {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}};


        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                System.out.print(m[i][j] + "\t");
            }
            System.out.println();

        }

    }

    //Given an M × N integer matrix, print it in spiral order.
    //Time Complexity
    //O(M*N)
    // Space Complexity
    //
    public static void printMatrixInOrder() {
        //input => int [][] arr={
        // {1,2,3},
        // {12,13,4},
        // {11,14,5}
        // {10,15,6}
        // {9,8,7}}
        //output=> 1,2,3,4,5,6,7,8,9,10,11,12,13,14,15
        System.out.println("-----------------------  Matrix In Order ----------------------");
        int[][] arr = {{1, 2, 3, 4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9}};

        // https://www.techiedelight.com/print-matrix-spiral-order/
        //https://medium.com/techie-delight/matrix-practice-problems-and-interview-questions-b4797cf9bd4
        //https://www.techinterviewhandbook.org/algorithms/linked-list/

        if (arr.length == 0 || arr == null) {
            return;
        }
        int top = 0, bottom = arr.length - 1;
        int left = 0, right = arr[0].length - 1;

        while (true) {
            if (left > right) {
                break;
            }
            //print top row
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;

            if (top > bottom) {
                break;
            }

            //print right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;
            if (left > right) {
                break;
            }

            //print bottom row
            for (int i = right; i >= left; i--) {
                System.out.print(arr[bottom][i] + " ");
            }
            bottom--;

            if (top > bottom) {
                break;
            }
            // print left column
            for (int i = bottom; i >= top; i--) {
                System.out.print(arr[i][left] + " ");
            }
            left++;
        }

    }

    // time complexity
    // O(MxN)
    // Space Complexity
    // O(MxN) > recursive stack
    public static void matrixSpiralRecursive() {
        int[][] arr = {{1, 2, 3, 4, 5},
                {16, 17, 18, 19, 6},
                {15, 24, 25, 20, 7},
                {14, 23, 22, 21, 8},
                {13, 12, 11, 10, 9}};
        int top = 0, bottom = arr.length - 1;
        int left = 0, right = arr[0].length - 1;
        System.out.println("\n----------------------- Spiral Matrix recursive ---------------------- ");
        printSpiral(arr, top, bottom, left, right);
    }

    private static void printSpiral(int[][] arr, int top, int bottom, int left, int right) {

        if (arr == null || arr.length == 0 || left > right) {
            return;
        }
        //print the top
        // output > 1, 2, 3, 4, 5
        for (int i = left; i <= right; i++) {
            System.out.print(arr[top][i] + " ");
        }
        top++;
        if (top > bottom) {
            return;
        }

        //print the right
        //output > 6 7 8 9
        for (int i = top; i <= bottom; i++) {
            System.out.print(arr[i][right] + " ");
        }
        right--;
        if (left > right) {
            return;
        }
        // print bottom row
        // output > 10 11 12 13
        for (int i = right; i >= left; i--) {
            System.out.print(arr[bottom][i] + " ");

        }
        bottom--;
        if (top > bottom) {
            return;
        }
        //print the left column
        //output> 13 14 15 16
        for (int i = bottom; i >= top; i--) {
            System.out.print(arr[i][left] + " ");
        }
        left++;

        printSpiral(arr, top, bottom, left, right);
    }


}
