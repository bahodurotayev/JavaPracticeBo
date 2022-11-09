package _01Prac;

import java.util.Arrays;

public class MoveZeroes {
    static int[] moveZero(int[] arr){
        int[] newArr = new int[arr.length];
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] != 0){
                newArr[count] = arr[i];
            count++;
            }
        }
        for (int i = count; i <newArr.length ; i++) {
            newArr[i] = 0;
        }
        return newArr;
    }

    public static void main(String[] args) {
        int[]arr = {1, 0, 2, 0, 3};
        int[] ints = moveZero(arr);
        System.out.println(Arrays.toString(ints));
    }
}
