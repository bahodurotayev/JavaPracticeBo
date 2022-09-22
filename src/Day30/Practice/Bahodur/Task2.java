package Day30.Practice.Bahodur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task2 {
      /*

    Create a method, which will have list of list of Strings as a parameter.
    Convert all String character to upper case.
    return the list of list of strings
     */
      public static void main(String[] args) {
          ArrayList<ArrayList<String>> listOfList = new ArrayList<>();
          listOfList.add(new ArrayList<>(Arrays.asList("bahodur", "alisher", "arda")));
          listOfList.add(new ArrayList<>(Arrays.asList("furkat", "dilnoza", "andrea")));

          Task2 t2 = new Task2();
          ArrayList<ArrayList<String>> listOfList2 = t2.listOfString(listOfList);
          System.out.println(listOfList2);

      }
      ArrayList<ArrayList<String>> listOfString(ArrayList<ArrayList<String>> listOfList){

          for (int i = 0; i < listOfList.size(); i++) {

              for (int j = 0; j < listOfList.get(i).size(); j++) {
                  String strToUpperCase = listOfList.get(i).get(j).toUpperCase();
                  listOfList.get(i).set(j, strToUpperCase);
              }

          }

          return listOfList;
      }
}
