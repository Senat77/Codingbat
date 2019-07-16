package makeLast;

/*
Given an int array, return a new array with double the length where its last element is the same as the original array,
and all the other elements are 0. The original array will be length 1 or more. Note: by default, a new int array
contains all 0's.

makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
makeLast([1, 2]) → [0, 0, 0, 2]
makeLast([3]) → [0, 3]
 */

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeLast(new int[] {4, 5, 6})));
        System.out.println(Arrays.toString(makeLast(new int[] {1, 2})));
        System.out.println(Arrays.toString(makeLast(new int[] {3})));
    }

    private static int[] makeLast(int[] nums) {
        int length = nums.length;
        int[] res = new int[length * 2];
        res[length * 2 - 1] = nums[length - 1];
        return res;
    }
}
