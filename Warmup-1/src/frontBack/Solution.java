package frontBack;

/*
Given a string, return a new string where the first and last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 */

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(frontBack("code"));
        System.out.println(frontBack("a"));
        System.out.println(frontBack("ab"));
    }

    public static String frontBack(String str)
    {
        if(str == null) return null;
        if("".equals(str)) return "";
        if(str.length() == 1) return str;
        return(str.charAt(str.length()-1) + str.substring(1,str.length()-1) + str.charAt(0));
    }
}
