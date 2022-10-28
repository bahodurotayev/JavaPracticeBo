package _01Prac;

import org.testng.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ListOfAnagram {
    static List<List<String>> groupAnagram(String[] str){
        List<List<String>> newList = new ArrayList<>();
        HashMap<String, List<String>>map = new HashMap<>();

        for (int i = 0; i < str.length; i++) {
            char[] charArr = str[i].toCharArray();
            Arrays.sort(charArr);
            String sorted = new String(charArr);
            if(!map.containsKey(sorted)){
                map.put(sorted, new ArrayList<>());
            }
            map.get(sorted).add(str[i]);
        }
        newList.addAll(map.values());
        return newList;
    }

    public static void main(String[] args) {
        String[] str = {"eat", "ate", "tea", "nat", "bat", "tan"};
        List<List<String>> lists = groupAnagram(str);
        System.out.println(lists);
    }
}
