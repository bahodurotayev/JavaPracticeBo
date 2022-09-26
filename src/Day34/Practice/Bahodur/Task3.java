package Day34.Practice.Bahodur;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    /*
    *  Create a method, which will return a ArrayList<Integer> and parameter is a ArrayList<Integer>.
        The method should sort the ArrayList.

        Note: Don`t use any of built-in sort methods.

        Example:
        {5,4,2,1,0,3}

        Result: {0,1,2,3,4,5}*/
    static ArrayList<Integer> sortArray (ArrayList<Integer> list){

        for (int i = 0; i <list.size() ; i++) {
            for (int j = list.size() - 1; j > i ; j--) {
                    // 5 4 2 1 0 3
                    // 0 1 2 3 4 5

                int tem = list.get(i);
                if(list.get(i) > list.get(j)){
                    list.set(i, list.get(j));
                    list.set(j, tem);
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,4,2,1,0,3));
        ArrayList<Integer> list1 = sortArray(list);
        System.out.println(list1);
    }
}
