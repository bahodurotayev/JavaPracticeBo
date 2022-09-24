package Day31.Practice.Bahodur;

import java.util.ArrayList;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        /*
    Create a method with parameter List of Lists of Integer and return type int.
    Print the max int.

    8:38 - 8:48

    Example: {{-1,-2,-3,-4,-5},{-2,-4,-6,-8,-10},{-3,-9,-18}} => result should be 18
     */

        ArrayList<ArrayList<Integer>> listOfList = new ArrayList<>();
        listOfList.add(new ArrayList<Integer>(Arrays.asList(1,2,3,4,5)));
        listOfList.add(new ArrayList<Integer>(Arrays.asList(2,4,6,8,10)));
        listOfList.add(new ArrayList<Integer>(Arrays.asList(2,3,4,5)));

        System.out.println(getMax(listOfList));


    }
    static int getMax(ArrayList<ArrayList<Integer>> list){
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).size(); j++) {
                if(list.get(i).get(j) > max){
                    max = list.get(i).get(j);
                }
            }
        }


        return max;
    }
}
