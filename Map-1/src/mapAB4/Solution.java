package mapAB4;

/*
Modify and return the given map as follows: if the keys "a" and "b" have values that have different lengths, then
set "c" to have the longer value. If the values exist and have the same length, change them both to the empty string
in the map.

mapAB4({"a": "aaa", "b": "bb", "c": "cake"}) → {"a": "aaa", "b": "bb", "c": "aaa"}
mapAB4({"a": "aa", "b": "bbb", "c": "cake"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
mapAB4({"a": "aa", "b": "bbb"}) → {"a": "aa", "b": "bbb", "c": "bbb"}
 */

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("a", "aa");
        map.put("b", "bbb");
        System.out.println(mapAB4(map));
    }

    private static Map<String, String> mapAB4(Map<String, String> map) {
        int lengthA = map.containsKey("a") ? map.get("a").length() : -1;
        int lengthB = map.containsKey("b") ? map.get("b").length() : -1;
        if(lengthA > -1 && lengthB > -1) {
            if (lengthA > lengthB) {
                map.put("c", map.get("a"));
            } else {
                if (lengthB > lengthA) {
                    map.put("c", map.get("b"));
                }
            }
        }
        if(lengthA > -1 && lengthA == lengthB) {
            map.put("a", "");
            map.put("b", "");
        }
        return map;
    }
}
