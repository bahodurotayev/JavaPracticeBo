package Day30.Practice.Bahodur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaArrayList {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> listOfList = new ArrayList<>();
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(11, 44, 66, 88, 1010, 1212));
        ArrayList<Integer> list3 = new ArrayList<>(Arrays.asList(100, 200, 300, 400, 500, 600));
        listOfList.add(list1);
        listOfList.add(list2);
        listOfList.add(list3);

        JavaArrayList t1 = new JavaArrayList();

        t1.printListOfList(listOfList);
        System.out.println("=============================================");


        for (ArrayList<Integer> eachList: listOfList) {
            for (Integer eachNum: eachList) {
                System.out.print(eachNum + " ");
            }
           System.out.println();
        }

      System.out.println();
    }


    void printListOfList(List<ArrayList<Integer>> listOfList){
        for (int i = 0; i < listOfList.size(); i++) {
            for (int j = 0; j < listOfList.get(i).size(); j++) {

                System.out.print(listOfList.get(i).get(j) + " ");

            }
            System.out.println();
        }
    }
}
