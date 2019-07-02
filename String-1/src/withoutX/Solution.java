package withoutX;

/*
Given a string, if the first or last chars are 'x', return the string without those 'x' chars, and otherwise return
the string unchanged.

withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(withoutX("xHix"));
        System.out.println(withoutX("xHi"));
        System.out.println(withoutX("Hxix"));
        System.out.println(withoutX("x"));
    }

    public static String withoutX(String str) {
        int length = str.length();
        if(length == 0 || str.equals("x"))
            return "";
        String res = "";
        res = (str.charAt(0) == 'x') ? str.substring(1) : str;
        res = (str.charAt(length - 1) == 'x') ? res.substring(0, res.length() - 1) : res;
        return res;
    }
}
