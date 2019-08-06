package fizzString;

/*
Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b" return "Buzz". If both the
"f" and "b" conditions are true, return "FizzBuzz". In all other cases, return the string unchanged.
(See also: FizzBuzz Code)

fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
 */

public class Solution {

    public static void main(String[] args) {
        System.out.println(fizzString("fig"));
        System.out.println(fizzString("dib"));
        System.out.println(fizzString("fib"));
        System.out.println(fizzString("aaa"));
    }

    private static String fizzString(String str) {
        String res = "";
        if(str.charAt(0) == 'f')
            res = "Fizz";
        if(str.charAt(str.length() - 1) == 'b')
            res += "Buzz";
        return (res.equals("")) ? str : res;
    }
}
