package stringE;

/*
Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */

public class Solution
{
    public static void main(String[] args)
    {
        System.out.println(stringE("Hello"));
        System.out.println(stringE("Heelle"));
        System.out.println(stringE("Heelele"));
    }

    public static boolean stringE (String str)
    {
        int count = 0;
        for(byte b : str.getBytes())
            if(b == (byte)'e')
                count++;
        return(count > 0 && count < 4);
    }
}
