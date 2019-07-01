package conCat;

/*
Given two strings, append them together (known as "concatenation") and return the result. However, if the concatenation
creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".

conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(conCat("abc", "cat"));
        System.out.println(conCat("dog", "cat"));
        System.out.println(conCat("abc", ""));
    }

    public static String conCat(String a, String b) {
        String aEnd = (a.length() == 0) ? "" : a.substring(a.length() - 1);
        String bBegin = (b.length() == 0) ? "" : b.substring(0, 1);
        return (!aEnd.equals("") && aEnd.equals(bBegin)) ? a + b.substring(1) : a + b;
    }
}
