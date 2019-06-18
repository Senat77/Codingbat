package array123;

/*
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.


array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(array123(new int[] {1, 1, 2, 3, 1}));
        System.out.println(array123(new int [] {1, 1, 2, 4, 1}));
        System.out.println(array123(new int [] {1, 1, 2, 1, 2, 3}));
    }

    public static boolean array123(int[] nums) {
        int counter = 1;
        for (int i: nums) {
            if(i == 1)
                counter = 1;
            if (i == counter) {
                if(counter == 3)
                    return true;
                else
                    counter++;
            }
            else
                counter = 1;
        }
        return false;
    }
}
