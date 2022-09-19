package Day21.Practice.Bahodur;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
  /*
        Task1
        Create an int 2D array. length of rows is 4, length of columns is 3
        using random class, assign values to each element between 0 and 10
         */

        //Task2
        // Create another array, of 2D arrays length.
        // values, should be total of inner of 2d arrays.
        // Example:
        //[[7, 6, 8, 9, 8], [6, 6, 9, 6, 3], [0, 6, 5, 5, 3], [6, 6, 7, 5, 7]]
        // output:
        //[38, 30, 19, 31]


        Random rnd = new Random();
        int[][] arr2d = new int[4][5];

        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <3 ; j++) {
                arr2d[i][j] = rnd.nextInt(11);
            }
        }
        System.out.println(Arrays.deepToString(arr2d));

        //  Task2--------------------------------------------

      int[] rawTotal = new int[arr2d.length];

        for (int i = 0; i <arr2d.length; i++) {
            int total = 0;
            for (int j = 0; j <arr2d.length; j++) {
               total +=arr2d[i][j];
            }
           rawTotal[i] = total;
        }
        System.out.println(Arrays.toString(rawTotal));
    }
}
