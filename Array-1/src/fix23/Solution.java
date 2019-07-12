package fix23;

/*
Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0.
Return the changed array.

fix23([1, 2, 3]) → [1, 2, 0]
fix23([2, 3, 5]) → [2, 0, 5]
fix23([1, 2, 1]) → [1, 2, 1]
 */

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(fix23(new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(fix23(new int[] {2, 3, 5})));
        System.out.println(Arrays.toString(fix23(new int[] {1, 2, 1})));
        System.out.println(Arrays.toString(fix23(new int[] {2, 2, 2})));
    }

    public static int[] fix23(int[] nums) {
        int length = nums.length;
        int [] arr = new int[length];
        arr[0] = nums[0];
        for(int i = 1;i < length; i++) {
            arr[i] = nums[i];
            if(nums[i] == 3 && nums[i - 1] == 2) {
                arr[i] = 0;
            }
        }
        return arr;
    }
}
