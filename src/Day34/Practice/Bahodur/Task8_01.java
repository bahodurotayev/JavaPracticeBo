package Day34.Practice.Bahodur;

import java.util.*;

public class Task8_01 {
       /* Task 8
           Create a method which will have as a parameter an array of strings.
           Return a Map<String, Boolean> where each different string is a key and
           its value is true if that string appears 2 or more times in the array.

           Example:
           ["a", "b", "a", "c", "b"]
           Result:
           {"a": true, "b": true, "c": false}*/

    static Map<String, Boolean> checkString (ArrayList<String> list){

        Map<String, Boolean> map = new HashMap<>();

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j <list.size()-1 ; j++) {
                if(list.get(i).equals(list.get(j)) && (i != j)){
                    map.put(list.get(i), true);
                    break;
                }else if (!list.get(i).equals(list.get(j)) && (i != j)){
                    map.put(list.get(i), false);
                }
            }
        }
        return map;
    }

    public static void main(String[] args) {
     ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "a", "c", "b", "b", "t", "ad", "ad", "g", "h"));
        Map<String, Boolean> stringBooleanMap = checkString(list);
        System.out.println(stringBooleanMap);
    }
}
