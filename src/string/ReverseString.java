package string;

//https://www.geeksforgeeks.org/print-words-string-reverse-order/?ref=lbp
//https://www.geeksforgeeks.org/reverse-a-string-in-java/
//https://www.geeksforgeeks.org/string-data-structure/?ref=gcse#Pattern
//https://www.geeksforgeeks.org/string-data-structure/?ref=gcse#split%20string
//https://www.geeksforgeeks.org/string-data-structure/?ref=gcse#sorting%20&%20searching
//https://www.geeksforgeeks.org/top-algorithms-and-data-structures-for-competitive-programming/?ref=gcse
//https://www.geeksforgeeks.org/overview-of-data-structures-set-3-graph-trie-segment-tree-and-suffix-tree/?ref=gcse//
//https://www.geeksforgeeks.org/difference-between-graph-and-tree/?ref=gcse
//https://www.geeksforgeeks.org/applications-of-graph-data-structure/?ref=gcse
//https://www.geeksforgeeks.org/data-structures/?ref=gcse
//https://www.geeksforgeeks.org/hashing-data-structure/?ref=gcse
//https://www.geeksforgeeks.org/hashtable-in-java/?ref=gcse
//https://www.geeksforgeeks.org/implementing-our-own-hash-table-with-separate-chaining-in-java/?ref=gcse
//https://www.geeksforgeeks.org/advantages-of-bst-over-hash-table/?ref=gcse
public class ReverseString {

//https://www.thecodingshala.com/2020/02/reverse-string-in-java-coding-shala.html
    public static void stringReverse() {
        System.out.println("Reverse by Loop ");
        stringReverseImp1();
        System.out.println("Reverse by byte ");
        stringReverseImp2();
        System.out.println("Reverse using StringBuffer ");
        reverseStringImpl3();
        System.out.println("Reverse using index  ");
        reverseStringImpl4();
        System.out.println("Reverse using swap  ");
        reverseStringImpl5();
    }

    /*
     * The idea is to traverse the length of the String
     * Extract each character while traversing
     * Add each Character in front of the existing String*/
    private static void stringReverseImp1() {
        //input String = Mundia
        //output aidnum

        String str = "Mundia", nstr = "";
        char ch;
        System.out.print("Original word: ");
        System.out.println(str);

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }

        System.out.println("Reversed word: " + nstr);
    }

    // converting String into Bytes: getBytes =>
// method is used to convert the input into bytes[].
    /*
     * create a temporary byte[] of length equal to the length
     * of the input string
     * store the bytes (which we get by using getBytes() method) in
     * reverse order into temporary byte[]
     * Create a new String object using byte[] to store result*/
    private static void stringReverseImp2() {

        //input > MundiaEm
        // output > mEaidnuM
        String input = "MundiaEm";

        // getBytes() method to convert string
        // into bytes[].
        System.out.print("Original word: ");
        System.out.println(input);
        byte[] strAsByteArray = input.getBytes();
        byte[] result = new byte[strAsByteArray.length];

        // Store result in reverse order into the
        // result byte[]
        for (int i = 0; i < strAsByteArray.length; i++) {
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];
        }
        System.out.println(new String(result));
    }

    private static void reverseStringImpl3() {
        String ms = "Google";
        StringBuffer stringBufferReverse = new StringBuffer(ms);
        stringBufferReverse.reverse();

        System.out.println(stringBufferReverse);
    }

    private static void reverseStringImpl4() {
        String input = "Software Engineer";
        char[] inputArray = input.toCharArray();
        for (int i = inputArray.length - 1; i >= 0; i--) {
            System.out.print(inputArray[i]);

        }
        System.out.println();
    }

    /*KKK
    * 1. Set the left index equal to 0 and right
       index equal to the length of the string -1.
    2. Swap the characters of the start index
       scanning with the last index scanning
       one by one. After that, increase the left
       index by 1 (left++) and decrease the right
       by 1 i.e., (right--) to move on to the next
       characters in the character array .
    3. Continue till left is less than or equal to
       the right.*/
    private static void reverseStringImpl5() {
        String input = "I am a software Engineer";
        char[] inputArray = input.toCharArray();
        int left, right = inputArray.length - 1;

        for (left = 0; left < right; left++, right--) {
            //swap the elements of left and right
            char s = inputArray[left];
            inputArray[left] = inputArray[right];
            inputArray[right] = s;
        }

        input = String.valueOf(inputArray);
        System.out.println(input);


    }

    public String reverseWords(String s) {
        char[] ca = s.toCharArray();
        for (int i = 0; i < ca.length; i++) {
            if (ca[i] != ' ') {   // when i is a non-space
                int j = i;
                while (j + 1 < ca.length && ca[j + 1] != ' ') { j++; } // move j to the end of the word
                reverse(ca, i, j);
                i = j;
            }
        }
        return new String(ca);
    }

    private void reverse(char[] ca, int i, int j) {
        for (; i < j; i++, j--) {
            char tmp = ca[i];
            ca[i] = ca[j];
            ca[j] = tmp;
        }
    }
}
