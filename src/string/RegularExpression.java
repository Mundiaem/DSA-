package string;

import java.util.Arrays;

public class RegularExpression {

    public static void implementPatternMatching() {

        String s = "baaabab";
        String p = "*****ba*****ab";
        System.out.println(" Regular Expression Pattern: " + wildCardPatternMatching(s, p));

    }

    private static boolean patternMatching(String s, String p) {
/*
* // If current characters match, result is same as
// result for lengths minus one. Characters match
// in two cases:
// a) If pattern character is '?' then it matches
//    with any character of text.
// b) If current characters in both match
if ( pattern[j – 1] == ‘?’) ||
     (pattern[j – 1] == text[i - 1])
    T[i][j] = T[i-1][j-1]

// If we encounter ‘*’, two choices are possible-
// a) We ignore ‘*’ character and move to next
//    character in the pattern, i.e., ‘*’
//    indicates an empty sequence.
// b) '*' character matches with ith character in
//     input
else if (pattern[j – 1] == ‘*’)
    T[i][j] = T[i][j-1] || T[i-1][j]

else // if (pattern[j – 1] != text[i - 1])
    T[i][j]  = false
* */

        int n = s.length();
        int m = p.length();
        // empty pattern can only match with empty string

        if (m == 0) {
            return (n == 0);
        }
        //lookup table for storing subprobleams
        boolean[][] lookup = new boolean[n + 1][m + 1];
        //initializing lookup with array to false
        for (int i = 0; i < n; i++) {
            Arrays.fill(lookup[i], false);

        }
        //empty pattern can match with empty string
        lookup[0][0] = true;

        // Only '*' can match with empty String

        for (int j = 1; j < m; j++) {
            if (p.charAt(j - 1) == '*') {
                lookup[0][j] = lookup[0][j - 1];
            }
        }

        //fill the table in the bottom-up fashion

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                // Two cases if we see a '*'
                // a) We ignore '*' character and move to the
                // next character in the pattern,
                // i.e., '*' indicates an empty sequence
                // b) '*' character matches with character in input

                if (p.charAt(j - 1) == '*') lookup[i][j] = lookup[i][j - 1] || lookup[i - 1][j];
                    // Current characters are considered as
                    // matching in two cases
                    // (a) current character of patterns is '?'
                    // (b) characters actually match

                else if (p.charAt(j - 1) == '?' || s.charAt(i - 1) == p.charAt(j - 1))
                    lookup[i][j] = lookup[i - 1][j - 1];

                    //if characters don't match
                else lookup[i][j] = false;

            }
        }


        return lookup[n][m];
    }

    private static boolean wildCardPatternMatching(String s, String p) {
        // make the dp matrix
        boolean[][] dp = new boolean[p.length() + 1][s.length() + 1];

        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                // marking the blank space as true
                if (i == 0 && j == 0) {
                    dp[0][0] = true;
                }
                // first row as false
                else if (i == 0) {
                    dp[0][j] = false;
                }
                //first column as false but have to check two rows above where there is *
                // this is because * can become black by not including anything
                else if (j == 0) {
                    char ch = p.charAt(i - 1);
                    if (ch == '*')
                        dp[i][j] = dp[i - 2][j]; // if star in first column then we can make a blank so we check two rows above
                    else dp[i][j] = false;
                }
                // processing for normal cells in the dp
                else {
                    // if the character in string and pattern match or pattern charcter is '.' then check diagonally (top-left)
                    // if true then here it is true too
                    if (p.charAt(i - 1) == s.charAt(j - 1) || p.charAt(i - 1) == '?') {
                        dp[i][j] = dp[i - 1][j - 1];
                    }

                    // else if a star is found then we check two rows above if true then continue for next iteration, here star
                    //has been used to make a blank

                    else if (p.charAt(i - 1) == '*') {
                        dp[i][j] = dp[i - 2][j];
                        if (dp[i][j]) {
                            continue;
                        }
                        // if being blank returns false then we check if the previous character to the star matches the string s last character
                        // this is done to show that the * has two options that either to remain blank and remove itself and its previous
                        // character from the pattern p or multiply and release another of the p.charAt(i-2) character, we then move left to check
                        // in the dp table if this is true or not ** (explaine in images)
                        if (p.charAt(i - 2) == s.charAt(j - 1) || p.charAt(i - 2) == '?') {
                            dp[i][j] = dp[i][j - 1];
                        }

                    }
                }

            }
        }
        return dp[p.length()][s.length()];
    }
}
