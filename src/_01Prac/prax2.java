package _01Prac;

import java.util.Arrays;

public class prax2 {
    static int[] startEndPosition(int[] arr, int target){
        int[] result = {-1, -1};

        if (arr == null || arr.length == 0)
            return result;

        result[0] = findTheStartIndex(arr, target);
        result[1] = findTheEndIndex(arr, target);

        return result;
    }
    static int findTheStartIndex(int[] arr, int target){

        int left = 0;
        int right = arr.length-1;
        int start =-1;

        while(left<= right){

            int mid = left+(right-left)/2;

            if (arr[mid] == target){
                start = mid; // this is start
                right = mid-1; // lets see if there one more on the left
            }else if (target > arr[mid]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }

        return start;
    }
    static int findTheEndIndex(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        int end = -1;

        while(left <= right){
            int mid = left + (right-left)/2;

            if (arr[mid] == target){
                end = mid;	  // this is the end
                left = mid+1; // lets see if there is one more on the right
            }else if (target > arr[mid])
                left = mid +1;
            else
                right = mid -1;

        }

        return end;
    }
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8,8, 8, 8, 8,  5};
        int[] ints = startEndPosition(arr, 8);
        System.out.println(Arrays.toString(ints));
    }
}
