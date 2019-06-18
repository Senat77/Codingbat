package altPairs;

/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(altPairs("kitten"));
        System.out.println(altPairs("Chocolate"));
        System.out.println(altPairs("CodingHorror"));
    }

    public static String altPairs(String str) {
        String res = "";
        int index = 0;
        while (index < str.length()) {
            if(index + 2 > str.length())
                res += str.substring(index);
            else
                res += str.substring(index, index + 2);
            index += 4;
        }
        return res;
    }
}
