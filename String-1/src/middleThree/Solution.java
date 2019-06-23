package middleThree;

/*
Given a string of odd length, return the string length 3 from its middle, so "Candy" yields "and". The string length
will be at least 3.


middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(middleThree("Candy"));
        System.out.println(middleThree("and"));
        System.out.println(middleThree("solving"));
    }

    public static String middleThree(String str) {
        int length = str.length();
        return (length < 4) ? str : str.substring((length - 3) / 2 , (length + 3) / 2);
    }
}
