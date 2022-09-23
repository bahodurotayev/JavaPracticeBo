package day31.Practice.Bahodur;

public class Task3 {
    //Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
    /*Input: nums = [1,2,3,1]
    Output: true
    Example 2:

    Input: nums = [1,2,3,4]
    Output: false
    Example 3:

    Input: nums = [1,1,1,3,3,4,3,2,4,2]
    Output: true*/
    public static void main(String[] args) {

        int[] num = {1,2,3,1};
        boolean b = appearsTwice(num);
        System.out.println(b);

    }

    static boolean appearsTwice(int[] arr){
        boolean check = false;
        for (int i = 0; i <arr.length -1 ; i++) {
          if(arr[i] == arr[i+1]){
              check = true;
          }
        }


        return check;
    }
}
