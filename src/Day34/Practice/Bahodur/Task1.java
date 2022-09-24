package Day34.Practice.Bahodur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        /* Task1
         1. Create a method which will return int[]. Parameter is int (n).
           The length of array is n.
           Using Random class, assign to each index of array a random number between 10 and 20.

          2. Create a method which will return a HashMap.
           Parameter will be int[].
           Return how many times each int of array repeats.
           */
        Task1 t1 = new Task1();
        Random rnd = new Random();
        int[] arr = t1.randomGenerateNumber(rnd.nextInt(10, 21));
        System.out.println(Arrays.toString(arr));

        HashMap<Integer, Integer> repeatedNum = t1.repeatedNum(arr);
        HashMap<Integer, Integer> repeatedNum2 = t1.repeatedNum2(arr); //WAY - 2
        HashMap<Integer, Integer> repeatedNum3 = t1.repeatedNum3(arr); //WAY - 3
        //HashMap<Integer, Integer> repeatedNum4 = t1.repeatedNum4(arr); //WAY - 4
        HashMap<Integer, Integer> repeatedNum5 = t1.repeatedNum5(arr); //WAY - 5



        System.out.println(repeatedNum);
        System.out.println(repeatedNum2);
        System.out.println(repeatedNum3);
        //System.out.println(repeatedNum4);
        System.out.println(repeatedNum5);

    }

    int[] randomGenerateNumber(int n) {
        Random rnd = new Random();
        int[] newArr = new int[rnd.nextInt(10, 21)];
        for (int i = 0; i < newArr.length; i++) {
            n = rnd.nextInt(10, 21);
            newArr[i] = n;
        }
        return newArr;
    }

    HashMap<Integer, Integer> repeatedNum(int[] arr) { // 1 - way
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.computeIfPresent(arr[i], (k, v) -> v + 1);
            map.computeIfAbsent(arr[i], (k) -> 1);
        }
        return map;
    }

    HashMap<Integer, Integer> repeatedNum2(int[] arr) { //2 - way
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        return map;
    }

    HashMap<Integer, Integer> repeatedNum3(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.get(arr[i]) == null) {
                map.put(arr[i], 1);
            } else {
                map.replace(arr[i], map.get(arr[i]) + 1);
            }
        }
        return map;
    }

    HashMap<Integer, Integer> repeatedNum4(int[] arr) { // way 4

        ArrayList<Integer> list = new ArrayList<Integer>(arr.length);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <arr.length ; i++) {
            Integer count = list.get(i);
            list.removeIf(eachNum -> eachNum != count);
            map.put(list.get(i), map.get(arr.length - list.size()));

        }

        return map;
    }
    HashMap<Integer, Integer> repeatedNum5(int[] arr) { // way 5
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i <arr.length ; i++) {
            Integer count = map.get(arr[i]);
            if(count == null){
                map.put(arr[i], 1);
            }else {
                map.put(arr[i], count+1);
            }
        }
        return map;
        }
}