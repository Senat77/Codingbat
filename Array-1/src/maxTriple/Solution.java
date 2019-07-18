package maxTriple;

/*
Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest.
The array length will be a least 1.

maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5

 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(maxTriple(new int[] {1, 2, 3}));
        System.out.println(maxTriple(new int[] {1, 5, 3}));
        System.out.println(maxTriple(new int[] {5, 2, 3}));
    }

    private static int maxTriple(int[] nums) {
        int length = nums.length;
        if(length < 1)
            return 0;
        int max = (nums[0] > nums[length / 2]) ? nums[0] : nums[length / 2];
        return (max > nums[length - 1]) ? max : nums[length - 1];
    }
}
