package _01Prac;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Stack;
import java.util.stream.Collectors;

public class prax1 {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "fliwht"};
        String s = longestCommonPrefix2(strs);
        System.out.println("longestCommonPrefix = " + s);

    }
    static String longestCommonPrefix(String[] strs){
        if(strs.length == 0){
            return "";
        }
        String prefix =strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
    public static String longestCommonPrefix2(String[] strs) {
        if (strs == null || strs.length == 0)
            return "";

        Arrays.sort(strs);
        String first = strs[0];
        String last = strs[strs.length - 1];
        int c = 0;
        while(c < first.length())
        {
            if (first.charAt(c) == last.charAt(c)){
                c++;
            }
            else {
                break;
            }
        }
        return c == 0 ? "" : first.substring(0, c);
    }
}

