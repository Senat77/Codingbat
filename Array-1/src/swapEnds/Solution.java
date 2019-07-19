package swapEnds;

/*
Given an array of ints, swap the first and last elements in the array. Return the modified array. The array length
will be at least 1.

swapEnds([1, 2, 3, 4]) → [4, 2, 3, 1]
swapEnds([1, 2, 3]) → [3, 2, 1]
swapEnds([8, 6, 7, 9, 5]) → [5, 6, 7, 9, 8]
 */

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4};
        System.out.println(Arrays.toString(swapEnds(array)));
        System.out.println(Arrays.toString(array));

        System.out.println(Arrays.toString(swapEnds(new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(swapEnds(new int[] {8, 6, 7, 9, 5})));
    }

    private static int[] swapEnds(int[] nums) {
        int length = nums.length;
        if(length < 1)
            return nums;
        int temp = nums[0];
        nums[0] = nums[length - 1];
        nums[length - 1] = temp;
        return nums;
    }
}
