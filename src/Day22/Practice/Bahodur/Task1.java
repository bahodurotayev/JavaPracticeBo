package Day22.Practice.Bahodur;

import java.util.Arrays;

public class Task1 {
    // 1. Create a method which will take as a parameter int[] and print maximum number in the given array (name of the method - getMaxNum)
    // 2. Create a method which will take as a parameter int[] and print minimum number in the given array (name of the method - getMinNum)
    // 3. Create a method which will take as a parameter int[] and print total of all numbers in the array (name of the method - getTotal)
    // 4. Create a method which will take as a parameter String[] and print all Strings in the reversed order (name of the method - reversedArray)

    public static void main(String[] args) {

        Task1 t1 = new Task1();
        int[] arr = {1, 2, 1, 5, 6, 123, 35, 57, 576};
        t1.printMax(arr);
        System.out.println(t1.getMin(arr));
        System.out.println(t1.getTotal(arr));
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(t1.reverse(arr)));

    }
    void printMax(int[] arr){
        int max = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println(max);
    }
    int getMin(int[] arr){
        int min = arr[0];
        for (int i = 0; i <arr.length ; i++) {
            if(min < arr[i]){
                 min = arr[i];
            }
        }
        return min;
    }
    int getTotal(int[] arr){
        // 1 2 3 1 3
        int total = 0;
        for (int i = 0; i <arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    int[] reverse(int[]arr){
        int[] newArr = new int[arr.length];
        for (int i = arr.length-1, j = 0; i >=0 ; i--, j++) {
          // int i = arr.length-1, j=0; i >=0; i--, j++
            newArr[j] = arr[i];
        }
        return newArr;
    }

}
