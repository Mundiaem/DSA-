package string;

public class ReverseStringWSpecialChar {

    /*
     * Given a string, that contains a special character together with
     * alphabets (‘a’ to ‘z’ and ‘A’ to ‘Z’), reverse the string
     * in a way that special characters are not affected.
     *
     * */

    public static void main(String[] args) {
        /*
        * Input:   str = "Ab,c,de!$"
        Output:  str = "ed,c,bA!$"
        *
        * Time Complexity
        * O(N)
        * Space Complexity
        * O(1)
        * */

        String s = "Ab,c,de!$";
        System.out.println("Original: " + s);
        System.out.println("Reversed: " + reverseString(s));
    }

    private static String reverseString(String s) {

        int left = 0, right = s.length() - 1;
        char[] chars = s.toCharArray();

        while (left < right ) {
            if (!Character.isAlphabetic(s.charAt(left))) {
                left++;
            } else if (!Character.isAlphabetic(s.charAt(right))) {
                right--;

            } else  {
                char temp = s.charAt(left);
                chars[left] = s.charAt(right);
                chars[right] = temp;
                left++;
                right--;
            }


        }
        return new String(chars);
    }
}
