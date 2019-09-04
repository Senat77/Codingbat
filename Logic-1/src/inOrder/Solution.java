package inOrder;

/*
Given three ints, a b c, return true if b is greater than a, and c is greater than b. However, with the exception
that if "bOk" is true, b does not need to be greater than a.

inOrder(1, 2, 4, false) → true
inOrder(1, 2, 1, false) → false
inOrder(1, 1, 2, true) → true
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(inOrder(1,2,4,false));
        System.out.println(inOrder(1,2,1,false));
        System.out.println(inOrder(1,1,2,true));
        System.out.println(inOrder(2,4,6,true));
    }

    private static boolean inOrder(int a, int b, int c, boolean bOk) {
        if (!bOk && b > a && c > b)
            return true;
        return bOk && b < c;
    }
}