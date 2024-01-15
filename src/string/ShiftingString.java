package string;

public class ShiftingString {

    public static void main(String[] args) {

        String s= "akabacaa";


        int n = s.length();
        int slow=1;
        int fast=3;
        s= s.substring(0,slow) + s.charAt(fast) + s.substring(slow,fast)+ s.substring(fast+1, n);
        System.out.println(s) ;

        System.out.println('q' - 'a' +1) ;
        System.out.println( (char)('a' + 0)==97) ;
        System.out.println(reArrangeChar(s));



    }
    private static String reArrangeChar(String s){
        /**
         * Time Complexity
         * O(N) - alphabet character count  and time spent to place char in the ans
         *
         * Space Complexity
         * O(K) due to the size of the alphabet 26
         */
        int  [] alphabetCount = new int [26];
        for(char c: s.toCharArray()){
            alphabetCount[c - 'a'] = alphabetCount[ c -'a']+1;
        }
        int maxCount =0, letter=0;
        for(int i=0; i<alphabetCount.length; i++){
            if(alphabetCount[i]>maxCount){
                maxCount= alphabetCount[i];
                letter=i;

            }
        }
        // if max char is greater than half the length of the string rounded off return empty string
        if(maxCount > (s.length()+1)/2) return "";

        char[] ans  = new char[s.length()];
        int index=0;

        while(alphabetCount[letter]>0){
            ans[index]=(char)( letter +'a');
            alphabetCount[letter]--;
            index +=2;
        }



        for(int i=0; i<alphabetCount.length; i++){
            while (alphabetCount[i]>0){
                if(index >= s.length()){
                    index=1;
                }
                ans[index]=(char)( i +'a');
                alphabetCount[i]--;
                index +=2;

            }

        }
        return String.valueOf(ans);

    }
}
