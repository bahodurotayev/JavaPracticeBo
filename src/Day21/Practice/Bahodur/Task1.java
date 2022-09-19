package Day21.Practice.Bahodur;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
         /*
        1. Initialize 2DArray.
        2. Print without for loop.
        Michael Jordan
        John Travolta
        Jim Kerry
         */

        String[] names = {"Michael", "John", "Jim"};
        String[] lastNames = {"Jordan", "Travolta", "Kerry"};


        String[][] arr2D = new String[2][];
        arr2D[0] = names;
        arr2D[1] = lastNames;

        for (int i = 0; i <arr2D[0].length ; i++) {
            System.out.println(arr2D[0][i] + " " + arr2D[1][i]);
        }

         /*
        Task3
        Print same result using nested for loop
         */
        System.out.println("=================================");
        for (int i = 0; i <arr2D[0].length ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.print(arr2D[j][i] + " ");
            }
            System.out.println();
        }

    }
}
