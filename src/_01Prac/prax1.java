package _01Prac;

import org.w3c.dom.ls.LSOutput;

import java.util.Stack;

public class prax1 {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String s = longestCommonPrefix(strs);
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
}
