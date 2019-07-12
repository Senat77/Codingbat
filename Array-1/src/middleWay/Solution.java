package middleWay;

/*
Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.


middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
 */

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(middleWay(new int [] {1, 2, 3}, new int [] {4, 5, 6})));
        System.out.println(Arrays.toString(middleWay(new int [] {7, 7, 7}, new int [] {3, 8, 0})));
        System.out.println(Arrays.toString(middleWay(new int [] {5, 2, 9}, new int [] {1, 4, 5})));
    }

    public static int[] middleWay(int[] a, int[] b) {
        int [] arr = new int [2];
        arr[0] = a[1];
        arr[1] = b[1];
        return arr;
    }
}
