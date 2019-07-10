package withoutX2;

/*
Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x' chars, and otherwise
return the string unchanged. This is a little harder than it looks.

withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(withoutX2("xHi"));
        System.out.println(withoutX2("Hxi"));
        System.out.println(withoutX2("Hi"));
    }

    public static String withoutX2(String str) {
        int length = str.length();
        String res = "";
        if (length > 0 && str.charAt(0) != 'x')
            res = String.valueOf(str.charAt(0));
        if (length > 1 && str.charAt(1) != 'x')
            res = res + String.valueOf(str.charAt(1));
        if (length > 2)
            res += str.substring(2);
        return res;
    }
}
