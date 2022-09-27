package Day35.Bahodur;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Task1 {
    public static void main(String[] args) {

        String[]arr = {"salt", "tea", "soda", "toast"};
        Map<String, String> map = firstChar(arr);
        System.out.println(map);


    }
    /*
    Modify and return the given map as follows: if the key "a" has a value, set the key "b" to have that value,
    and set the key "a" to have the value "". Basically "b" is a bully, taking the value and replacing it with the empty string.
    mapBully({"a": "candy", "b": "dirt"}) → {"a": "", "b": "candy"}*/
    public static Map<String, String> firstChar(String[] str) {
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i <str.length ; i++) {

            if(map.containsKey(str[i].substring(0,1))){
                map.put(str[i].substring(0, 1), map.get(str[i].substring(0,1)).concat(str[i]));
            }else {
                map.put(str[i].substring(0,1), (str[i]));
            }
        }
        return map;
    }
}
