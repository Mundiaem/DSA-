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
        if (arr == null || arr.length == 0 || left > right) {
            return;
        }
        int prev, curr;
        /*

        top - starting column index
        bottom - ending column index;
        left - starting row index
        right - end of the row index
        * */
        while (left < right && top < bottom) {
            if (left + 1 == right || top + 1 == bottom) {
                break;
            }
            //Store the first element of the next
            // row, this element will replace
            // first element of current row

            prev = arr[top + 1][left];

            // Move elements of first row
            // from the remaining rows

            for (int i = top; i < right; i++) {
                curr = arr[left][i];
                arr[left][i] = prev;
                prev = curr;
            }
            left++;

            //Move elements of last column
            // from the remaining column

            for (int i = left; i < right; i++) {
                curr = arr[i][bottom - 1];
                arr[i][bottom - 1] = prev;
                prev = curr;
            }
            bottom--;

            // Move elements of last row
            // from the remaining rows

            if (left < right) {
                for (int i = bottom - 1; i >= top; i--) {
                    curr = arr[right - 1][i];
                    arr[right - 1][i] = prev;
                    prev = curr;
                }
            }
            right--;


            // Move elements of first column
            // from the remaining rows
            if (top < bottom) {
                for (int i = right - 1; i >= left; i--) {
                    curr = arr[i][top];
                    arr[i][top] = prev;
                    prev = curr;
                }
            }
            top++;


            // print rotated matrix
            for (int i = 0; i < left; i++) {
                for (int j = 0; j < top; j++) {
                    System.out.print(arr[i][j] + " ");
                    System.out.print("\n");
                }
            }
        }
    }
}
