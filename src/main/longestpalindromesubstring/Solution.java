package longestpalindromesubstring;

/**
 * @author Daniel Draper <a href="mailto:Germandrummer92@gmail.com">
 * @version 1.0
 *          Created on ${Date}
 */
public class Solution {
    private static boolean isPalindrome(String s) {
        StringBuffer sb = new StringBuffer(s);
        return (sb.reverse().toString().equals(s));
    }

    public static void main(String args[]) {
        System.out.println("a".substring(0, 1));
        System.out.println("isPalindrome(\"a\") = " + isPalindrome("a"));
    }

    public String longestPalindrome(String s) {
        String currentLongest = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if (isPalindrome(s.substring(i, j + 1)) && currentLongest.length() < (j - i) + 1) {
                    currentLongest = s.substring(i, j + 1);
                }
            }
        }
        return currentLongest;
    }
}