package makeMiddle;

/*
Given an array of ints of even length, return a new array length 2 containing the middle two elements from the
original array. The original array will be length 2 or more.

makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
 */

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(makeMiddle(new int[] {1, 2, 3, 4})));
        System.out.println(Arrays.toString(makeMiddle(new int[] {7, 1, 2, 3, 4, 9})));
        System.out.println(Arrays.toString(makeMiddle(new int[] {1, 2})));
    }

    public static int[] makeMiddle(int[] nums) {
        int length = nums.length;
        int [] arr = new int [2];
        arr [0] = nums[length / 2 - 1];
        arr [1] = nums[length / 2];
        return arr;
    }
}
