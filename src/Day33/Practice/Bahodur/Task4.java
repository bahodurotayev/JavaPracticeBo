package Day33.Practice.Bahodur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task4 {
    public static void main(String[] args) {
        // Task 1
        /*
        Create a method, which will return a map with position as a key, and total compensation as value
        Manager = 270000
        Ceo = 525000
        etc...
         */
        HashMap<String, ArrayList<Integer>> compensation = new HashMap<>();
        compensation.put("Manager", new ArrayList<>(Arrays.asList(100000, 120000, 50000)));
        compensation.put("CEO", new ArrayList<>(Arrays.asList(300000, 150000, 75000)));
        compensation.put("Admin", new ArrayList<>(Arrays.asList(70000, 90000, 30000)));
        compensation.put("Accountant", new ArrayList<>(Arrays.asList(110000, 95000, 25000)));

        HashMap<String, Integer> compensationTotalCompensation = getCompensation(compensation);
        System.out.println(compensationTotalCompensation);

    }
    static int getTotal (ArrayList<Integer> list){
        int total= 0;
        for (int i = 0; i < list.size(); i++) {
            total +=list.get(i);
        }
        return total;
    }
   static HashMap<String, Integer> getCompensation(HashMap<String, ArrayList<Integer>> map){
        HashMap<String, Integer> compensation = new HashMap<>();

        for (Map.Entry<String, ArrayList<Integer>> value: map.entrySet()) {
            compensation.put(value.getKey(), getTotal(value.getValue()));
        }
        return compensation;
    }

}
