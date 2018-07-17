package diff21;

/*
Given an int n, return the absolute difference between n and 21, except return double the absolute
difference if n is over 21.
*/

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(diff21(2));
        System.out.println(diff21(-2));
        System.out.println(diff21(23));
    }

    public static int diff21 (int n)
    {
        if (n > 21)
        {
            return (2*Math.abs(21-n));
        }
        return (Math.abs(21-n));
    }

    // Site-solution :
    /*
    public int diff21(int n)
    {
        if (n <= 21)
        {
            return 21 - n;
        }
        else
        {
            return (n - 21) * 2;
        }
    }
     */
}
