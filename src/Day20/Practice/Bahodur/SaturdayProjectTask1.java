package Day20.Practice.Bahodur;

import java.util.Arrays;
import java.util.Random;

public class SaturdayProjectTask1 {
        /*
    Task1:
            1. Create two int arrays. Name them as arrOuter and arrInner.
            1.a arrOuter is length of 4.
            1.b arrInner is length of 2.

            2. Using Random class, generate random numbers between 0 and 10
    and fill all indexes of both arrays.

        3. Sort both of arrays.

            4. Print true if all the numbers in the inner array also appear in the outer array.
            Otherwise, print false
            (In other words, print true if first array contains second array.)
    Samples:
            [1, 2, 4, 6], [2, 4] → true
            [1, 2, 4, 6], [2, 3] → false
            [1, 2, 4, 4], [2, 4] → true

 */
        public static void main(String[] args) {

            SaturdayProjectTask1 spt = new SaturdayProjectTask1();
            int[] outerArr = spt.FillingRandomNumber(4);
            int[] innerArr = spt.FillingRandomNumber(2);

            Arrays.sort(outerArr);
            Arrays.sort(innerArr);

            System.out.println("Outer Array = " + Arrays.toString(outerArr));
            System.out.println("Inner Array = " + Arrays.toString(innerArr));

            spt.Check(outerArr,innerArr);

           /* int counter = 0;
            for (int inner: innerArr
                 ) {
                for (int outer:outerArr
                     ) {
                    if (inner == outer ){
                        counter++;
                        break;
                    }
                }
            }
            boolean check = counter == innerArr.length;
            System.out.println(check);*/
        }

        int[] FillingRandomNumber(int length){
            Random random = new Random();
            int[] arr = new int[length];
            for (int i = 0; i <length; i++) {
                int randomNumber = random.nextInt(0, 11);
                arr[i] = randomNumber;   // or arr[i] = (int)(Math.random() * 10);
            }
            return arr;
        }

        void Check (int[]arr, int[]arr2){
            int counter = 0;
            outer:for (int i = 0; i <arr.length ; i++) {
                inner:for (int j = 0; j <arr2.length ; j++) {
                    if(arr2[j] == arr[i]){
                        counter++;
                        continue outer;
                    }
                }
            }
            System.out.println(counter == 2 ? "true" : "false");
        }
}
