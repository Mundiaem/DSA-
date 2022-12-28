package Arrays.Arrays;

import java.util.Arrays;

/**
 * created with  by mundiaem
 * created on 28/12/2022
 * Time: 10:46
 * ⚡  - DSA-
 */

public class SqrSortedArrays {
private static int [] sqrOfSortedArrays(int[] arr){
    int n= arr.length;
    int[] results  = new int[n];
    int i=0, j= n-1;
    for(int p=n-1; p>=0; p--){
        if(Math.abs(arr[i])>Math.abs(arr[j])){
            System.out.println(arr[i] +" "+arr[j] + " Absolute Value "+ Math.abs(arr[i]) +" "+Math.abs(arr[j]));
        results[p]= arr[i]*arr[i];
        i++;
        }else {
            System.out.println(arr[i] +" "+arr[j] + " Absolute Value "+ Math.abs(arr[i]) +" "+Math.abs(arr[j]));

            results[p]= arr[j]*arr[j];
            j--;
        }

    }
    return results;
}
    public static void main(String[] args) {
    int[] nums = {-4,-1,0,3,10};
        System.out.println(Arrays.toString(sqrOfSortedArrays(nums)));
    }

}
