package Day34.Practice.Sebahattin_Homework;

import java.util.ArrayList;
import java.util.Arrays;

public class Task03 {
/*    Create a method, which will return a ArrayList<Integer> and parameter is a ArrayList<Integer>.
        The method should sort the ArrayList.

        Note: Don`t use any of built-in sort methods.

                Example:
        {5,4,2,1,0,3}

        Result: {0,1,2,3,4,5}
*/
    public static void main(String[] args) {
    ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5,1,2,4,0,3));
        System.out.println((getSortList(list)));
}
    static ArrayList<Integer> getSortList (ArrayList<Integer> list){
//        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            for (int j = list.size() - 1; j > i; j--) {
                if (list.get(i) > list.get(j)) {
                    int buckup = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, buckup);
                }
            }
        }
        return list;
    }

}
