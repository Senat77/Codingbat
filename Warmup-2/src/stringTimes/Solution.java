package stringTimes;

/*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.


stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(stringTimes("Hi", 2));
        System.out.println(stringTimes("Hi", 3));
        System.out.println(stringTimes("Hi", 1));

        System.out.println(stringTimes2("Hi", 2));
        System.out.println(stringTimes2("Hi", 3));
        System.out.println(stringTimes2("Hi", 1));
    }

    private static  String stringTimes(String str, int n) {
        return str.repeat(n);
    }

    private static String stringTimes2(String str, int n) {
        if(n < 1) return "";
        if(n != 1)
            str += stringTimes(str, n - 1);
        return str;
    }
}
