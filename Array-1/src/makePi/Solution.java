package makePi;

/*
Return an int array length 3 containing the first 3 digits of pi, {3, 1, 4}.

makePi() → [3, 1, 4]
 */

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(makePi()));
    }

    private static int[] makePi() {
        return (new int[] {3, 1, 4});
    }
}
