package Day34.Practice.Bahodur;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Task1_01 {
    /* Task1
         1. Create a method which will return int[]. Parameter is int (n).
           The length of array is n.
           Using Random class, assign to each index of array a random number between 10 and 20.

          2. Create a method which will return a HashMap.
           Parameter will be int[].
           Return how many times each int of array repeats.
           */
    static int[] randomNumber( int num){
        Random rnd = new Random();
        int []arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = rnd.nextInt(10, 21);
        }
        return arr;
    }
    static HashMap<Integer, Integer> arrCount (int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer eachNum: arr) {
            map.computeIfPresent(eachNum, (k, v) -> v + 1);
            map.computeIfAbsent(eachNum, (k) -> 1);
        }

        return map;
    }

    public static void main(String[] args) {
        int[] ints = randomNumber(5);
        System.out.println(Arrays.toString(ints));
        HashMap<Integer, Integer> integerIntegerHashMap = arrCount(ints);
        System.out.println(integerIntegerHashMap);

    }
}
