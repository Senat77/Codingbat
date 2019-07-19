package frontPiece;

/*
Given an int array of any length, return a new array of its first 2 elements. If the array is smaller than length 2,
use whatever elements are present.

frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]
 */

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(frontPiece(new int[] {1, 2, 3})));
        System.out.println(Arrays.toString(frontPiece(new int[] {1, 2})));
        System.out.println(Arrays.toString(frontPiece(new int[] {1})));
    }

    private static int[] frontPiece(int[] nums) {
        int[] arr = new int[(nums.length > 2) ? 2 : nums.length];
        for (int i = 0; i < arr.length; i++ ) {
            arr[i] = nums[i];
        }
        return arr;
    }
}
