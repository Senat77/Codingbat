package stringX;

/*
Given a string, return a version where all the "x" have been removed. Except an "x" at the very start or end should
not be removed.

stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(stringX("xxHxix"));
        System.out.println(stringX("abxxxcd"));
        System.out.println(stringX("xabxxxcdx"));
    }

    public static String stringX(String str) {
        if(str.length() < 3)
            return str;
        String res = "";
        for(int i = 1; i < str.length() - 1; i++) {
            char c = str.charAt(i);
            if(c != 'x')
                res += c;
        }
        return str.charAt(0) + res + str.charAt(str.length() - 1);
    }
}
