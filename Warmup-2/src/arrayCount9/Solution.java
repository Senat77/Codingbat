package arrayCount9;

/*
Given an array of ints, return the number of 9's in the array.


arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(arrayCount9(new int[] {1, 2, 9}));
        System.out.println(arrayCount9(new int[] {1, 9, 9}));
        System.out.println(arrayCount9(new int[] {1, 9, 9, 3, 9}));
    }

    public static int arrayCount9(int[] nums) {
        int count = 0;
        for (int n : nums) {
            if(n == 9)
                count++;
        }
        return count;
    }
}
