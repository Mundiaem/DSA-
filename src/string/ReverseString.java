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


    public static void stringReverse() {
        System.out.println("Reverse by Loop ");
        stringReverseImp1();
        System.out.println("Reverse by byte ");
        stringReverseImp2();
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
}
