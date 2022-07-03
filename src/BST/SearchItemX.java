package BST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SearchItemX {


    /*
     * input
     *
     * :TODO actual bursary  array
     * //int[] arrayOne = {83, 54, 17, 46, 72, 31, 23, 55, 63, 49, 40, 21, 95, 36, 81, 39, 28, 79, 32, 72, 39, 10, 47, 94, 83, 74, 6, 53, 36, 94, 13, 30, 12, 62, 31, 16, 36, 66, 26, 29, 86, 55, 88, 40, 1, 0, 94, 38, 94, 9}
     * :TODO: actual Applicants
     *  int[] arrayTwp = {38, 16, 98, 48, 10, 76, 59, 26, 24, 27, 88, 99, 39, 45, 89, 23, 76, 46, 86, 51, 5, 58, 74, 40, 42, 36, 20, 81, 13, 94, 13, 60, 27, 1, 0, 24, 98, 82, 70, 93, 26, 64, 73, 83, 4, 31, 20, 0, 57, 40, 40, 19, 49, 2, 39, 6, 39, 69, 93, 72, 78, 90, 14, 88, 45, 78, 54, 54, 55, 79}
     * // input
     * int[] arrayOne={4,2,1,5,6,7,8,3};
     * int [] arrayTwo= {1,3,4,5,7,9,12,10,11,13,15};
     * output
     * int[] results= {1,2,3,4,5,6,7,8}
     *
     *
     *  */
    public int[] qualifiedStudents() {
        int[] arrayOne = {83, 54, 17, 46, 72, 31, 23, 55, 63, 49, 40, 21, 95, 36, 81, 39, 28, 79, 32, 72, 39, 10, 47, 94, 83, 74, 6, 53, 36, 94, 13, 30, 12, 62, 31, 16, 36, 66, 26, 29, 86, 55, 88, 40, 1, 0, 94, 38, 94, 9};
        int[] arrayTwo = {38, 16, 98, 48, 10, 76, 59, 26, 24, 27, 88, 99, 39, 45, 89, 23, 76, 46, 86, 51, 5, 58, 74, 40, 42, 36, 20, 81, 13, 94, 13, 60, 27, 1, 0, 24, 98, 82, 70, 93, 26, 64, 73, 83, 4, 31, 20, 0, 57, 40, 40, 19, 49, 2, 39, 6, 39, 69, 93, 72, 78, 90, 14, 88, 45, 78, 54, 54, 55, 79};
        int[] arrayOne_ = {4, 2, 1, 5, 6, 7, 8, 3};
        int[] arrayTwo_ = {1, 3, 4, 5, 7, 9, 12, 10, 11, 13, 15};

        List<Integer> output = new ArrayList<Integer>();
        //Time complexity
        // O(n log n)
        //- adaptation of quicksort: dual-pivot quicksort and mergesort:timsort
        Arrays.sort(arrayTwo_);
        int x, i, n = arrayOne_.length, low = 0, high = n;
        for (i = 0; i < n; i++) {
            int r = binarySearch(arrayTwo_, arrayOne_[i], low, high);
            if (r != -1) {
                //
                output.add(arrayTwo_[r]);
            }
        }
        // Converting Stream<Integer> to integer array
        // using stream() and mapToInt() methods
        // storing them in an integer array
        // time complexity
        // worst case> O(n)
        return output.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    // Time Complexity
    // O(log n)
    //space complexity
    // O(1) > recursive
    private int binarySearch(int[] arr, int x, int low, int high) {
        if (high >= low) {
            int mid = low + (high - low) / 2;
            if (arr[mid] == x)
                return mid;
            //on the left side of the array
            if (arr[mid] > x)
                return binarySearch(arr, x, low, mid - 1);
            if (x > arr[mid])
                return binarySearch(arr, x, mid + 1, high);

        }
        return -1;
    }


}
