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
        System.out.println(repeatedNum);

    }
    int[] randomGenerateNumber(int n){
        Random rnd = new Random();
        int[] newArr = new int[rnd.nextInt(10, 21)];
        for (int i = 0; i < newArr.length; i++) {
            n = rnd.nextInt(10, 21);
            newArr[i] = n;
        }
        return newArr;
    }

    HashMap<Integer, Integer>repeatedNum (int[] arr){ // 1 - way
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.computeIfPresent(arr[i], (k,v) -> v+1);
            map.computeIfAbsent(arr[i], (k) -> 1);
        }
        return map;
    }
    
    HashMap<Integer, Integer>repeatedNum2(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            
        }
        
        return map;
    }
}
