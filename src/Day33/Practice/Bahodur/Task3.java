package Day33.Practice.Bahodur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> compensation = new HashMap<>();
        compensation.put("Manager", new ArrayList<>(Arrays.asList(100000, 120000, 50000)));
        compensation.put("CEO", new ArrayList<>(Arrays.asList(300000, 150000, 750000)));
        compensation.put("Admin", new ArrayList<>(Arrays.asList(70000, 90000, 30000)));
        compensation.put("Accountant", new ArrayList<>(Arrays.asList(110000, 95000, 25000)));

        HashMap<String, Integer> getTotalCompensation = compensation(compensation);
        System.out.println(getTotalCompensation);

        // 2-way
//        HashMap<String, Integer> getTotalCompensation = compensation2(compensation);
//        System.out.println(getTotalCompensation);



    }

    static int getTotal(ArrayList<Integer> list) {
        int total = 0;
        for (int i = 0; i < list.size(); i++) {
            total += list.get(i);
        }
        return total;
    }

    static HashMap<String, Integer> compensation(HashMap<String, ArrayList<Integer>> map) {

        HashMap<String, Integer> totalSalary = new HashMap<>();

        for (Map.Entry<String, ArrayList<Integer>> value : map.entrySet()) {
            totalSalary.put(value.getKey(), getTotal(value.getValue()));
        }

        return totalSalary;
    }

    static HashMap<String, Integer> compensation2(HashMap<String, ArrayList<Integer>> map){
        // 2-way
        HashMap<String, Integer> totalSalary = new HashMap<>();
        for (String key:map.keySet()) {
            totalSalary.put(key, getTotal(map.get(key)));
        }
            return totalSalary;
    }
}
