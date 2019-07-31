package lastDigit;

/*
Given three ints, a b c, return true if two or more of them have the same rightmost digit. The ints are non-negative.
Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.

lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(lastDigit(23, 19, 13));
        System.out.println(lastDigit(23, 19, 12));
        System.out.println(lastDigit(23, 19, 3));
    }

    private static boolean lastDigit(int a, int b, int c) {
        char cA = getLastChar(a);
        char cB = getLastChar(b);
        char cC = getLastChar(c);
        return (cA == cB) || (cB == cC) || (cA == cC);
    }

    private static char getLastChar(int a) {
        String str = String.valueOf(a);
        return str.charAt(str.length() - 1);
    }
}
