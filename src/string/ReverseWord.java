package string;

/**
 * created with love by mundiaem
 * created on 03/07/2022
 * Time: 08:21
 * ⚡  - DSA-
 */

public class ReverseWord {

    public static void reverseWord() {
        System.out.println("Reverse word ");
        reverseWordImpl();
    }
/*
* step 1 Traverse from the last character until it encounter a space c
* character
* step 2 Put a Null characters at the position of space character and print the string after it
* step 3 At the end, the loop ends when it reaches the first character,
* so print the remaining character, it will print the first NULL character
* hence the first word will be printed
*  */
    private static void reverseWordImpl() {
        // Input: s = “I am practicing to code word reverse ”
        // Output: s = “reverse word code to practicing am I”
        //Input: s = “getting good at coding needs a lot of practice”
        // Output: s = “practice of lot a needs coding at good getting”

        String input = "I am practicing to code word reverse";

        char[] inputArray = input.toCharArray();

        int start = 0, end = inputArray.length;

    }


}
