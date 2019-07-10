package reverse3;

/*
Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
 */

public class Solution {

    public static void main(String[] args) {
        printArray(reverse3(new int [] {1, 2, 3}));
        printArray(reverse3(new int [] {5, 11, 9}));
        printArray(reverse3(new int [] {7, 0, 0}));
    }

    public static int[] reverse3(int[] nums) {
        int [] resArr = new int [3];
        for (int i = 0; i < 3 ; i++) {
            resArr[2 - i] = nums[i];
        }
        return resArr;
    }

    public static void printArray (int[] nums) {
        for (int e : nums) {
            System.out.print(e + " ");
        }
        System.out.println();
    }
}
