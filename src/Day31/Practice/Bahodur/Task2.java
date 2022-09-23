package Day31.Practice.Bahodur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task2 {
    public static void main(String[] args) {

        ArrayList<ArrayList<Character>> list = new ArrayList<>();
        list.add(new ArrayList<Character>(Arrays.asList('4', '8', '3')));
        list.add(new ArrayList<Character>(Arrays.asList('1', '9', '4')));
        list.add(new ArrayList<Character>(Arrays.asList('8', '3', '0')));

        reverseList(list);
        System.out.println(list);

    }

    static ArrayList<ArrayList<Character>> reverseList(ArrayList<ArrayList<Character>> list){
        for (ArrayList<Character> characters:list) {
            Collections.sort(characters);
        }
        return list;
    }
}
