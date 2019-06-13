package intMax;

/*
Given three int values, a b c, return the largest.


intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(intMax(1, 2, 3));
        System.out.println(intMax(1, 3, 2));
        System.out.println(intMax(3, 2, 1));
    }

    private static int intMax(int a, int b, int c) {
        int max = (a >= b) ? a : b;
        return (max >= c) ? max : c;
    }
}
