package slidingwindow;

/**
 * created with love by mundiaem
 * created on 05/01/2023
 * Time: 22:30
 * ⚡  - DSA-
 */

public class MaximumSumOfKE {

    public static void main(String[] args) {
       /*
       *1. Adding the first K components together and save the result in the currentSum variable
       * Because this is the first sum. it is also the current maximum; thus, save it in the variable maximumSum
       * 2. As the window size is K, we move the window one place to the right and compute the sum
       * of the items in the window.
       * 3. Update the maximum if the currentSum is greater than maximumSum, and repeat step 2.
       *
       * */
        int [] arr = {16,12,9,19,11,8};

        System.out.println(maximumSum(arr, 3));
    }

    private static int maximumSum(int [] arr, int k){

        /*
        * Example
        * input int [] arr = {16,12,9,19,11,8};
        * step 1: currentSum= 16+12+9=37
        *       maximumSum = 37
        * step 2: currentSum = 37-16+19=40
        *       maximumSum =40
        * step 3: currentSum = 40-12+11=39
        *         maximumSum= 40
        * step 4: currentSum = 40-9+8=39
        *         maximumSum= 40
        * Time Complexity
        *   O(N)
        * Space Complexity
        *   O(1)
        * */

        //length of the array
        int n= arr.length;


        // length of array(n) must be greater than window size(k)

        if(n<k){
            return -1;
        }
        // sum of first k(window size) elements
        int window_sum= 0;
        for (int i=0; i<k; i++){
            window_sum += arr[i];
        }

        int max_sum= window_sum;

        //calculating sums of remaining windows by
        // removing first element of previous window
        //and adding last element of current window
        //this way our window moves forward

        //Also updating the maximum sum to current window sum
        //if the current window sum is greater
        //than existing maximum sum

        for (int i=k;i<n; i++){
            window_sum+= (arr[i] -arr[i-k]);
            max_sum=Math.max(window_sum, max_sum);
        }

        return max_sum;

    }
}
