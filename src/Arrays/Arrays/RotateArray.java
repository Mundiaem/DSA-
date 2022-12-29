package Arrays.Arrays;

import java.util.Arrays;

/**
 * created with love by mundiaem
 * created on 28/12/2022
 * Time: 11:27
 * ⚡  - DSA-
 */

public class RotateArray {
    public static void main(String[] args) {
        int []  nums = {1,2,3,4,5,6,7}; int k = 3;
        System.out.println(Arrays.toString(rotate(nums, k)));

    }
    private static int [] rotate(int [] arr, int k){
          /*
        Example
        Input: nums = [1,2,3,4,5,6,7], k = 3
        Output: [5,6,7,1,2,3,4]
        Explanation:
        rotate 1 steps to the right: [7,1,2,3,4,5,6]
        rotate 2 steps to the right: [6,7,1,2,3,4,5]
        rotate 3 steps to the right: [5,6,7,1,2,3,4]


        This is a great solution, but it is weird that no one tried to prove the solution in a mathematical way in this discussion. I will try to prove its correctness, as I feel more comfortable to understand it in this way, other than a bunch of examples.

        k %= nums.length; makes sure that k is less than the length of the array.
        There are two parts of the array that we need to care about:

        Goal1: Assume range1 = [0, n - k - 1]. Members of this range only need to move to the right by k steps. For any member i in this range, the targeted position is i + k. In other words, we need to move every member i in range1 to position i + k
        Goal2: Assume range2 = [n - k, n - 1]. Members of this range will have to move beyond the boundary of the array, thus for any member i in this range, the targeted position is (i + k) % n , which is equivalent to i + k - n. In other words, we need to move every member i in range2 to position i + k - n.
        For any member i, after the first reverse(...) call, its new position j will be n - i - 1.

        By replacing the i in n - i - 1, we can calculate the new value of range1 from [0, n - k - 1] to [n - (n - k - 1) - 1, n - 1], which is [k, n - 1] (as range1 is reversed, its left and right bounds also need to be reversed).
        The similar procedure can be applied to range2, the new range2 now becomes [0, k - 1]

        For any member j in the new range2, the second reverse(...) call will assign the member j to a new position k - 1 - j. Notice that, this j is actually equal to n - i - 1, where i is the original position. So, the new position now becomes k - 1 - (n - i - 1) = k - n + i, which meets Goal2.

        The similar procedure can be applied to range1, with the third reverse(...) call, which will meet Goal1.
        */


        //use recursive function
        // find the modulus kth rotation
        int n= arr.length;
        k%=n;
        reverse(arr, 0, n-1);
        reverse(arr, 0, k-1);
        reverse(arr, k, n-1);
       return arr;
    }
    private static void reverse(int [] arr, int start, int end ){
        while (start<end){
            int temp = arr[start];
            arr[start]=arr[end];
            arr[end]= temp;
            start++;
            end--;
        }
    }
/*
*
* https://leetcode.com/problems/find-xor-sum-of-all-pairs-bitwise-and/
https://leetcode.com/problems/parallel-courses-iii/description/
* https://leetcode.com/problems/reverse-vowels-of-a-string/description/
* https://leetcode.com/problems/maximum-twin-sum-of-a-linked-list/description/
* https://leetcode.com/problems/swapping-nodes-in-a-linked-list/description/
* https://leetcode.com/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/description/
* https://leetcode.com/problems/check-if-word-is-valid-after-substitutions/description/
* https://leetcode.com/problems/check-if-a-parentheses-string-can-be-valid/description/
 */
}
