package Day30.Practice.Bahodur;

import java.util.ArrayList;
import java.util.Arrays;

public class Task1 {
     /*
    Create listOfLists of String.
    1. have at least 3 lists within listOfLists
    2. Size of the list or values could be anything.
    3. print the list of lists, using enhanced for loop or regular for loop.
    10 min - 9.0
     */

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> listOfList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(4, 5, 6, 7));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(8, 9, 0, 1));

        listOfList.add(list1);
        listOfList.add(list2);
        listOfList.add(list3);

        for (ArrayList<Integer> eachList: listOfList) {
            for (Integer eachNum:eachList) {
                System.out.print(eachNum + " ");
            }
            System.out.println();
        }

        System.out.println("2 way ============================================");
        for (ArrayList<Integer> eachList: listOfList) {
            eachList.forEach(eachNum -> System.out.print(eachNum + " "));
            System.out.println();
        }

    }
}
