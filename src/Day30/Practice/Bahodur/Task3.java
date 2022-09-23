package Day30.Practice.Bahodur;

import java.util.ArrayList;
import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
          /*
    Create a method, which will have list of list of Strings as a parameter.
    Convert all Strings to be Camel Case. Example dog => Dog, if cat => Cat
    return the list of list of strings.
     */

        ArrayList<ArrayList<String>> listOfLists = new ArrayList<ArrayList<String>>();

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("January", "February", "March"));
        ArrayList<String> list3 = new ArrayList<>(Arrays.asList("dog", "cat", "mouse", "rabbit"));

        listOfLists.add(list1);
        listOfLists.add(list2);
        listOfLists.add(list3);

        Task3 t3 = new Task3();
        t3.convertToCamelCase(listOfLists);
        System.out.println(listOfLists);

    }
    ArrayList<ArrayList<String>> convertToCamelCase(ArrayList<ArrayList<String>> listOfList){

        for (ArrayList<String> eachList:listOfList) {
            for (String eachElement:eachList) {
                String s = eachElement.substring(0, 1).toUpperCase();
                eachElement =s.concat(eachElement.substring(1));
            }
        }
        return listOfList;
    }
}
