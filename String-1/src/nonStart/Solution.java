package nonStart;

/*
Given 2 strings, return their concatenation, except omit the first char of each. The strings will be at least length 1.

nonStart("Hello", "There") → "ellohere"
nonStart("java", "code") → "avaode"
nonStart("shotl", "java") → "hotlava"
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(nonStart("Hello", "There"));
        System.out.println(nonStart("java", "code"));
        System.out.println(nonStart("shotl", "java"));
    }

    public static String nonStart(String a, String b) {
        String newA = (a.length() > 1) ? a.substring(1) : "";
        String newB = (b.length() > 1) ? b.substring(1) : "";
        return newA + newB;
    }
}
