package frontAgain;

/*
Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with
"edited".

frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(frontAgain("edited"));
        System.out.println(frontAgain("edit"));
        System.out.println(frontAgain("ed"));
    }

    public static boolean frontAgain(String str) {
        int length = str.length();
        return (length > 1) && (str.substring(0, 2).equals(str.substring(length - 2)));
    }
}
