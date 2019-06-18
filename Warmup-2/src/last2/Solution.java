package last2;

/*
Given a string, return the count of the number of times that a substring length 2 appears in the string and also as the
last 2 chars of the string, so "hixxxhi" yields 1 (we won't count the end substring).


last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2

 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(last2("hixxhi"));
        System.out.println(last2("xaxxaxaxx"));
        System.out.println(last2("axxxaaxx"));
        System.out.println(last2("1717171") );
    }

    private static int last2(String str) {
        if(str.length() < 3)
            return 0;
        String foundSub = str.substring(str.length() - 2);
        String inStr = str.substring(0, str.length() - 1);
        int count = 0;
        while(inStr.length() > 1) {
            if(inStr.substring(0,2).equals(foundSub))
                count ++;
            inStr = inStr.substring(1);
        }
        return count;
    }
}
