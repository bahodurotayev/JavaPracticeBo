package Day20.Practice.Bahodur;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        //int arr[] = {3,5,1,0,100,-1,-5,5000,2,10};
        //sort the array and reverse it

        int[] arr = {3,5,1,0,100,-1,-5,5000,2,10};
        Arrays.sort(arr);

        int[] reverseArr = new int[arr.length];
        for (int i = 0, j =arr.length-1; i < arr.length; i++, j--) {
            reverseArr[i] =arr[j];
           // System.out.println(reverseArr[i]);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverseArr));
    }
}
