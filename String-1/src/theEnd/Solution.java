package theEnd;

/*
Given a string, return a string length 1 from its front, unless front is false, in which case return a string length 1
from its back. The string will be non-empty.

theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(theEnd("Hello", true));
        System.out.println(theEnd("Hello", false));
    }

    public static String theEnd(String str, boolean front) {
        return String.valueOf((front) ? str.charAt(0) : str.charAt(str.length() - 1));
    }
}
