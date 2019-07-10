package deFront;

/*
Given a string, return a version without the first 2 chars. Except keep the first char if it is 'a' and keep the second
char if it is 'b'. The string may be any length. Harder than it looks.

deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(deFront("Hello"));
        System.out.println(deFront("java"));
        System.out.println(deFront("away"));
    }

    public static String deFront(String str) {
        int length = str.length();
        String res = "";
        if (length > 2)
            res += str.substring(2);
        if (length > 1 && str.charAt(1) == 'b')
            res = "b" + res;
        if (length > 0 && str.charAt(0) == 'a')
            res = "a" + res;
        return  res;
    }
}
