package Day20.Practice.Bahodur;

import java.util.Arrays;

public class SaturdayProjectTask9 {
    public static void main(String[] args) {
          /*
        Task9.
        Given an array of [6,5,2,7,9,1,3,8,6,2,1,3,7,9,9]
        1. Sort an array. output should be [1, 1, 2, 2, 3, 3, 5, 6, 6, 7, 7, 8, 9, 9, 9]
        2. Remove all duplicates from the array and print.
        output should be [1, 2, 3, 4, 5, 6, 7, 8, 9]
         */
        int[] arr = {6,5,2,7,9,1,3,8,6,2};
        System.out.println(Arrays.toString(arr));
        int temp = 0;
        for (int i = 0; i <arr.length-1; i++) {
            for (int j = i; j <arr.length-1; j++) {
                if(arr[i] > arr[j]){
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] =temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        String removeDuplicate = "";
        for (int i = 0; i <arr.length-1; i++) {
           if(arr[i] != arr[i+1]){
               removeDuplicate += arr[i] + " ";

           }

        }
        System.out.println("removeDuplicate = " + removeDuplicate);
    }
}
