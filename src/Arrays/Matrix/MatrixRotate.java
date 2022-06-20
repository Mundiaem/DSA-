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
}
