package Day20.Practice.Bahodur;

import java.util.Arrays;
import java.util.Random;

public class SaturdayProjectTask4 {
    public static void main(String[] args) {
             /*
    Task4:
            1. Create one int array with length of 10.
            2. Using Random class, generate random numbers between 0 and 20
             and fill all indexes of an array.
            3. Print the difference between the largest and smallest values in the array. (largest - smallest = difference)
            [10, 3, 5, 6, 8, 7, 5, 6, 8, 7] → 7 (observe 10-3 = 7)
   */
        int [] arr = new int[10];
        Random rnd = new Random();
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = (int)(Math.random() * 20);
        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int max = arr[arr.length-1];
        int min = arr[0];

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("Difference = " + (max - min));




//        int min = arr[0];
//        int max = arr[0];
//
//        for (int i = 0; i < arr.length; i++) {
//            if (max > arr[i]) {
//                max =arr[i];
//            }else if(min < arr[i]){
//                min = arr[i];
//            }
//        }
//        System.out.println(Arrays.toString(arr));
//        System.out.println(min);
//        System.out.println(max);
    }
}
