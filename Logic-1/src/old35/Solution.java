package old35;

/*
Return true if the given non-negative number is a multiple of 3 or 5, but not both. Use the % "mod" operator -- see
Introduction to Mod

old35(3) → true
old35(10) → true
old35(15) → false
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(old35(3));
        System.out.println(old35(10));
        System.out.println(old35(15));
    }

    private static boolean old35(int n) {
        return (n % 5 == 0 ^ n % 3 == 0);
    }
}
