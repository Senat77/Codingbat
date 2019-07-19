package mapBully;

/*
Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value, and set the
key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.

mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy"}) → {"a": "", "b": "candy"}
mapBully({"a": "candy", "b": "carrot", "c": "meh"}) → {"a": "", "b": "candy", "c": "meh"}
 */

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<>();
        map1.put("a", "candy");
        map1.put("b", "dirt");
        map1.put("c", "meh");
        System.out.println(mapBully(map1));
    }

    private static Map<String, String> mapBully(Map<String, String> map) {
        if(map.containsKey("a")) {
            map.put("b", map.get("a"));
            map.put("a", "");
        }
        return map;
    }
}
