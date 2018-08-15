package in3050;

/*
Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are both in the range
40..50 inclusive.


in3050(30, 31) → true
in3050(30, 41) → false
in3050(40, 50) → true
 */

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(in3050(30, 31));
        System.out.println(in3050(30, 41));
        System.out.println(in3050(40, 50));
    }

    public static boolean in3050(int a, int b)
    {
        return (a > 29 && a < 41 && b > 29 && b < 41) || (a > 39 && a < 51 && b > 39 && b < 51);
    }
}
