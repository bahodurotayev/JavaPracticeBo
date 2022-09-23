package Day33.Bahodur.Practice;

import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {
        HashMap<String, Integer> map =  new HashMap<>();
        map.put("a", 10);
        map.put("b", 10);
        map.put("c", 10);
        map.put("d", 10);
        map.put("e", 10);
        map.put("f", 10);
        map.put("g", 10);

        System.out.println(map);

        System.out.println("==============================");

        for (String key: map.keySet()) {
            if (key.equals("a")){
                map.put(key, 10);
            } else if (key.equals("b")) {
                map.put(key, 20);
            } else if (key.equals("c")) {
                map.put(key, 30);
            } else if (key.equals("d")) {
                map.put(key, 40);
            } else if (key.equals("e")) {
                map.put(key, 50);
            } else if (key.equals("f")) {
                map.put(key, 60);
            } else if (key.equals("g")) {
                map.put(key, 70);
            }
        }
        System.out.println(map);
        System.out.println("=================================");

        for (String key:map.keySet()) {
            System.out.println("Key is : " + key + " value is : " + map.get(key));
        }
    }
}
