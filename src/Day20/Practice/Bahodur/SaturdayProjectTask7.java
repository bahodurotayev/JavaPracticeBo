package Day20.Practice.Bahodur;

import java.util.Arrays;
import java.util.Random;

public class SaturdayProjectTask7 {
    public static void main(String[] args) {
        /*
        1. Create an array with random length between 5 and 15.
        2. Generate random numbers between 0 and 3 and insert into an array.
        3. Print true if the first element and the last element are equal.
                Print false otherwise
        Example:
            [1, 2, 3] → false
                [1, 2, 3, 1] → true
                [1, 2, 1] → true
                [1] → true
 */
        Random rnd = new Random();
        int[] arr = new int[rnd.nextInt(1, 6)];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = rnd.nextInt(0, 4);
        }
        System.out.println(Arrays.toString(arr));
        if(arr[0] == arr[arr.length-1]){
            System.out.println(true);
        } else if (arr.length == 1){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
