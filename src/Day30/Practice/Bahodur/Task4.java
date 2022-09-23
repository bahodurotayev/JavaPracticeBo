package Day30.Practice.Bahodur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Task4 {
    public static void main(String[] args) {
/*
    The classic word-count algorithm:
    given an array of strings, return a Map<String, Integer>
    with a key for each different string, with the value the number of times that string appears in the array.

    wordCount(["a", "b", "a", "c", "b"]) → {"a": 2, "b": 2, "c": 1}
    wordCount(["c", "b", "a"]) → {"a": 1, "b": 1, "c": 1}
    wordCount(["c", "c", "c", "c"]) → {"c": 4}*/

        Task4 t4 = new Task4();
        ArrayList<String> list = new ArrayList<>(Arrays.asList("a", "b", "a", "c", "b", "a", "a", "a"));
       // String[] list = {"a", "b", "a", "c", "b"};
        System.out.println(t4.wordCount(list));
    }
    HashMap<String, Integer> wordCount(ArrayList<String> list){

        HashMap<String, Integer> getWordCount = new HashMap<>();

        for (String eachElement: list) {
            Integer counter = getWordCount.get(eachElement);

            if(counter == null){
                getWordCount.put(eachElement, 1);
            }else{
                getWordCount.put(eachElement, counter + 1);
            }
        }
        return getWordCount;
    }

}
