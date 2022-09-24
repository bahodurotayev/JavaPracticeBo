package Day34.Practice.Bahodur;

import java.util.*;

public class Task2 {
    /* Create a method, which will return a character and parameter is a String.
        Given a string consisting of lowercase Latin Letters.
        Return the first non-repeating character in the string.
        If there is no non-repeating character, return '$'.

        Example:
        String = zxvczbtxyzvy

        Result: c*/

    static char returnChar (String str) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            if(map.containsKey(str.charAt(i))){
                map.put(str.charAt(i), map.get(str.charAt(i))+1);
            }else {
                map.put(str.charAt(i), 1);
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if (map.get(str.charAt(i)) == 1){
                return str.charAt(i);
            }
        }

    return '$';
    }

    static char returnChar2(String str){
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c: str.toCharArray()) {
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for (char c: str.toCharArray()) {
            if(map.get(c) == 1){
                return c;
            }
        }
        return '$';
    }

    static char returnChar3(String str){
        for (int i = 0; i < str.length(); i++) {
            if(str.indexOf(str.charAt(i)) == str.lastIndexOf(str.charAt(i))){
                    return str.charAt(i);
            }
        }
        return '$';
    }
    static char returnChar4(String str){
        for (int i = 0; i < str.length(); i++) {
            boolean notSeenD = true;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) && (i != j)){
                    notSeenD = false;
                    break;
                }
            }
            if(notSeenD)
                return str.charAt(i);
        }
        return '$';
    }
    public static void main(String[] args) {

        String str = "zxvczbtxyzvy";
        // System.out.println(returnChar(str));
        //System.out.println(returnChar2(str));
        //System.out.println(returnChar3(str));
        System.out.println(returnChar4(str));
    }
}
