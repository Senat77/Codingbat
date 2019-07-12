package no23;

/*
Given an int array length 2, return true if it does not contain a 2 or 3.

no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false

 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(no23(new int [] {4, 5}));
        System.out.println(no23(new int [] {4, 2}));
        System.out.println(no23(new int [] {3, 5}));
    }

    public static boolean no23(int[] nums) {
        for (int e : nums) {
            if(e == 2 || e == 3)
                return false;
        }
        return true;
    }
}
