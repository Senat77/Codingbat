package delDel;

/*
Given a string, if the string "del" appears starting at index 1, return a string where that "del" has been deleted.
Otherwise, return the string unchanged.


        delDel("adelbc") → "abc"
        delDel("adelHello") → "aHello"
        delDel("adedbc") → "adedbc"
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(delDel("adelbc"));
        System.out.println(delDel("adelHello"));
        System.out.println(delDel("adedbc"));
    }

    private static String delDel(String str) {
        if(str.length() <= 3) return str;
        return (str.substring(1,4).equals("del")) ? str.charAt(0) + str.substring(4) : str;
    }
}
