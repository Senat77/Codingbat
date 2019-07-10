package lastTwo;

/*
Given a string of any length, return a new string where the last 2 chars, if present, are swapped, so "coding" yields
"codign".

lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(lastTwo("coding"));
        System.out.println(lastTwo("cat"));
        System.out.println(lastTwo("ab"));
    }

    public static String lastTwo(String str) {
        int length = str.length();
        return (length > 1) ? str.substring(0, length - 2) + str.charAt(length - 1) + str.charAt(length - 2) : str;
    }
}
