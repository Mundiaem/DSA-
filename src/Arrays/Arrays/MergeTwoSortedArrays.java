package Arrays.Arrays;

import java.util.Arrays;

public class MergeTwoSortedArrays {

    private static int[] merge(int [] nums1, int m, int [] nums2, int n){
        int mPtr = m-1;
        int nPtr = n-1;
        int index = nums1.length -1;
        while(nPtr>=0){
            if(mPtr>= 0 && nums1[mPtr]>= nums2[nPtr]){
                nums1[index--]= nums1[mPtr--];

            }else{
                nums1[index--]= nums2[nPtr--];
            }
        }
        return nums1;
    }
    public static void main(String[] args) {
        /***
         * index= 5 insert 6
         * index= 4 insert 5
         * ------------------
         *
         */
        int [] nums1= {1,2,3,0,0,0};
        int [] nums2= {2,5,6};
        int n=3;
        int m= 3;
        System.out.println(Arrays.toString(merge(nums1, m, nums2, n)));


    }
}
