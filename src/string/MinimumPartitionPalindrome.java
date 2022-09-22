package string;

public class MinimumPartitionPalindrome {
/*
* Example 1
* input String s= bababcbadcede
* output int r=4
*
* Approach
* -> b
* -> babab
* ->
* Write a recurrence
* 1. Express everything in terms of index
* 2. Express all possibilities
* 3. Take the min of all possibilities
* 4. Write a base case
*
* Time complexities
* *> Memoization dp[n]
*
*
* */

    public static void implMinPartition(){
        String s= "bababcbadcede";
        System.out.println(" MinimumPartitionPalindrome: "+ palindromePartitioning(s));

    }
    static int palindromePartitioning(String str){
        int n= str.length();
        int [] dp= new int[n-1];
        return f(0, n, str, dp)-1;
    }
    static boolean isPalindrome (int i, int j, String s){
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    static int f (int i, int n, String str, int[] dp){
        if(n==0) return 0;
        if (dp[i]!=-1) return dp[i];
        int minCost= Integer.MAX_VALUE;

        // i...j
        for(int j=i; j<n; j++){
            if(isPalindrome(i, j, str)){
                int cost= 1+f(j+1, n, str, dp);
                minCost= Math.min(minCost, cost);
            }

        }
        return dp[i]= minCost;

    }
}
