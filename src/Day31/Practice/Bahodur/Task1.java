package Day31.Practice.Bahodur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> listOfLists = new ArrayList<ArrayList<Integer>>();

        listOfLists.add( new ArrayList<>(Arrays.asList(1, 2, 5, 6)));
        listOfLists.add( new ArrayList<>(Arrays.asList(10, 20, 50, 60)));
        listOfLists.add(new ArrayList<>(Arrays.asList(100, 200, 500, 600)));

        int max = list(listOfLists);
        System.out.println(max);


    }
    static int list(ArrayList<ArrayList<Integer>> listOfLists){

        int max = 0;
        for (int i = 0; i <listOfLists.size() ; i++) {
            for (int j = 0; j <listOfLists.get(i).size() ; j++) {
               max = Collections.max(listOfLists.get(i));
            }
        }
        return max;
    }
}
