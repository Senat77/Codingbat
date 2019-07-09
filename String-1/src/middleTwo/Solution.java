package middleTwo;

/*
Given a string of even length, return a string made of the middle two chars, so the string "string" yields "ri". The
string length will be at least 2.

middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(middleTwo("string"));
        System.out.println(middleTwo("code"));
        System.out.println(middleTwo("Practice"));
    }

    public static String middleTwo(String str) {
        int length = str.length();
        return (length < 3) ? str : str.substring(length / 2 - 1, length / 2 + 1);
    }
}
