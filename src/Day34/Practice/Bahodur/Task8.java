package Day34.Practice.Bahodur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task8 {
    /* Task 8
           Create a method which will have as a parameter an array of strings.
           Return a Map<String, Boolean> where each different string is a key and
           its value is true if that string appears 2 or more times in the array.

           Example:
           ["a", "b", "a", "c", "b"]
           Result:
           {"a": true, "b": true, "c": false}*/
   static HashMap<String, Boolean> stringTrueAndFalse(ArrayList<String> list){
       HashMap<String, Boolean> map = new HashMap<>();
       for (int i = 0; i < list.size(); i++) {
           for (int j = 0; j <list.size() ; j++) {
               if(list.get(i).equals(list.get(j)) && (i != j)){
                   map.put(list.get(i), true);
                   break;
               } else if (!list.get(i).equals(list.get(j)) & (i != j)) {
                   map.put(list.get(i), false);
               }
           }
       }
       return map;
   }
    public static void main(String[] args) {

       ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "a", "c", "b","d", "c"));
        HashMap<String, Boolean> map = stringTrueAndFalse(list);
        System.out.println(map);
    }
}
