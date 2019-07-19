package double23;

/*
Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(double23(new int[] {2, 2}));
        System.out.println(double23(new int[] {3, 3}));
        System.out.println(double23(new int[] {2, 3}));
    }

    private static boolean double23(int[] nums) {
        int flag2 = 0, flag3 = 0;
        for (int e : nums) {
            if(e == 3)
                flag3++;
            if(e == 2)
                flag2++;
        }
        return flag2 >= 2 || flag3 >= 2;
    }
}
