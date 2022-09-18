package Day20.Practice.Bahodur;

import java.util.Arrays;
import java.util.Random;

public class SaturdayProjectTask3 {
    public static void main(String[] args) {
        /* Task3:
        1. Create two int arrays. Name them as arrOuter and arrInner.
            1.a arrOuter is length of 4.
            1.b arrInner is length of 2.
        2. Using Random class, generate random numbers between 0 and 10
        and fill all indexes of both arrays.

       3. Print true if they have the same first element, or they have the same last element.
        Samples:
        [1, 2, 4, 6], [2, 6] → true
        [1, 2, 4, 6], [2, 3, 4] → false
        [1, 2, 4, 4, 6], [1, 4] → true
         */
        SaturdayProjectTask3 st = new SaturdayProjectTask3();
        int[] outer = st.FillingRandomNumber(4);
        int[] inner = st.FillingRandomNumber(2);

        System.out.println("Outer = " + Arrays.toString(outer));
        System.out.println("Inner = " + Arrays.toString(inner));

        boolean bl = false;
        for (int i = 0; i <outer.length ; i++) {
            if (outer[0] == inner[0] || outer[outer.length-1] == inner[inner.length-1]){
                bl = true;
                break;
            }
        }
        System.out.println(bl);
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
}
