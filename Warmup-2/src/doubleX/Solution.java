package doubleX;

/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true

 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(doubleX("axxbb"));
        System.out.println(doubleX("axaxax"));
        System.out.println(doubleX("xxxxx"));
    }

    private static boolean doubleX(String str) {
        if(str.length() < 2 || str.indexOf('x') == str.length() - 1) return false;
        return (str.charAt(str.indexOf('x') + 1) == 'x');
    }
}
