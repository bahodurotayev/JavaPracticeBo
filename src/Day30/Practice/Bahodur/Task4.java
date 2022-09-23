package Day30.Practice.Bahodur;

import java.util.HashMap;

public class Task4 {
    public static void main(String[] args) {
/*The classic word-count algorithm:
    given an array of strings, return a Map<String, Integer>
    with a key for each different string, with the value the number of times that string appears in the array.

wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
wordCount(["c", "c", "c", "c"]) → {"c": 4}*/



    }

    HashMap<String, Integer> wordCount (String[] arr) {
        HashMap<String, Integer> map = new HashMap<>();
        int count  = 0;
        for (int i = 0; i < arr.length-1; i++) {
            if(arr[i] == arr[i + 1]) {
                count++;
            }
            map.put(String.valueOf(arr[i]), count);
        }

        return map;
    }
}
