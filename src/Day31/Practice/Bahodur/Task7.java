package Day31.Practice.Bahodur;

import java.util.HashMap;

public class Task7 {
    public static void main(String[] args) {
        HashMap<String, Integer> map =  new HashMap<>();
        map.put("a", 10);
        map.put("b", 20);
        map.put("c", 30);
        map.put("d", 40);
        map.put("e", 50);
        map.put("f", 60);
        map.put("g", 70);
        //printMap(map);

        HashMap<String, Integer> stringIntegerHashMap = newMap(map);
        System.out.println( stringIntegerHashMap);
    }

    static void printMap(HashMap<String, Integer> map){

        map.forEach((key, value) -> {
            System.out.println("key is : " + key + " value is : " + value);
        });
    }

    static HashMap<String, Integer> newMap (HashMap<String, Integer> map){

        HashMap<String, Integer> newMap2 = new HashMap<>();

        map.forEach((key, value) -> {if(key.equals("a")){
            newMap2.put(key, 70);
        }else if (key.equals("b")){
            newMap2.put(key, 80);
        }else if (key.equals("c")){
            newMap2.put(key, 90);
        }else if (key.equals("d")){
            newMap2.put(key, 100);
        }else if (key.equals("e")){
            newMap2.put(key, 120);
        }
        else if (key.equals("f")){
            newMap2.put(key, 140);
        }else if (key.equals("g")){
            newMap2.put(key, 160);
        }

        });

        return newMap2;
    }

}
