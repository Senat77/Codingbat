package sum2;

/*
Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2, just
sum up the elements that exist, returning 0 if the array is length 0.

sum2([1, 2, 3]) → 3
sum2([1, 1]) → 2
sum2([1, 1, 1, 1]) → 2
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(sum2(new int[]{1, 2, 3}));
        System.out.println(sum2(new int[] {1, 1}));
        System.out.println(sum2(new int[] {1, 1, 1, 1}));
    }

    private static int sum2(int[] nums) {
        switch(nums.length) {
            case 0 : return 0;
            case 1 : return nums[0];
            default: return nums[0] + nums[1];
        }
    }
}
