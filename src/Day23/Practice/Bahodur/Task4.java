package Day23.Practice.Bahodur;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
     /*Write a Java program to print an array after changing the rows and columns of a given two-dimensional array.

1)    2D Array should have random length btw 3 – 6 for both rows and columns
2)    Added elements should be generated randomly btw 0 – 100 in tens format 10, 20, 30, …

Original Array Example:
{{10 20 30},
{40 50 60}}  //length is 2;

After changing the rows and columns of the above array:
{{10 40},
{20 50},
{30 60}}
*/
     public static void main(String[] args) {
         Random rnd = new Random();
         int[][] intArr2D = new int[rnd.nextInt(3, 7)][rnd.nextInt(3, 7)];

         for (int i = 0; i < intArr2D.length ; i++) {
             for (int j = 0; j < intArr2D[i].length ; j++) {
                 intArr2D[i][j] = rnd.nextInt(10)*10;
             }
         }
         System.out.println(Arrays.deepToString(intArr2D));

         System.out.println();
         for (int[] arr: intArr2D) {
             System.out.println(Arrays.toString(arr));
         }
         System.out.println();

         int[][] new2dArr = new int[intArr2D[0].length][intArr2D.length];
         for (int i = 0; i <intArr2D.length ; i++) {
             for (int j = 0; j <intArr2D[i].length ; j++) {
                 new2dArr[j][i] = intArr2D[i][j];
             }
         }

         System.out.println();
         for (int[] arr2: new2dArr) {
             System.out.println(Arrays.toString(arr2));
         }
      }
}
