package extraFront;

/*
Given a string, return a new string made of 3 copies of the first 2 chars of the original string. The string may be any
length. If there are fewer than 2 chars, use whatever is there.

extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(extraFront("Hello"));
        System.out.println(extraFront("ab"));
        System.out.println(extraFront("H"));
        System.out.println(extraFront(""));
    }

    public static String extraFront(String str) {
        int length = (str.length() > 2) ? 2 : str.length();
        String res = str.substring(0, length);
        return res + res + res;
    }
}
