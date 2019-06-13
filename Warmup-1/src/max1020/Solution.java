package max1020;

/*
Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or return 0 if neither is
in that range.

max1020(11, 19) → 19
max1020(19, 11) → 19
max1020(11, 9) → 11

*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(max1020(11, 19));
        System.out.println(max1020(19, 11));
        System.out.println(max1020(11, 9));
        System.out.println(max1020(10, 21));
    }

    private static int max1020(int a, int b) {
        int max = 0;
        if(a <= 20 && a >= 10)
            max = a;
        if(b <= 20 && b >= 10 && b > max)
            max = b;
        return max;
    }
}
