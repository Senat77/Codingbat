package without2;

/*
Given a string, if a length 2 substring appears at both its beginning and end, return a string without the substring
at the beginning, so "HelloHe" yields "lloHe". The substring may overlap with itself, so "Hi" yields "". Otherwise,
return the original string unchanged.


without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") → ""
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(without2("HelloHe"));
        System.out.println(without2("HelloHi"));
        System.out.println(without2("Hi"));
    }

    public static String without2(String str) {
        int length = str.length();
        return ((length > 1) && (str.substring(0, 2).equals(str.substring(length - 2)))) ? str.substring(2) : str;
    }
}
