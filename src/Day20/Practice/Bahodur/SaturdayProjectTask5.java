package Day20.Practice.Bahodur;

import java.util.Arrays;
import java.util.Random;

public class SaturdayProjectTask5 {
    public static void main(String[] args) {
/*
        Task5:
        Create a char array
        The array has a random length between 2 and 22 (inclusive)
                The array should only have random capital letters.
                Print the array.
 */
        Random rnd = new Random();
        int random = 2 +rnd.nextInt(22-2);

        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        char[] ch = new char[random];
        for (int i = 0; i <ch.length ; i++) {
            ch[i] = alphabet.charAt(rnd.nextInt(26));
        }

        System.out.println(Arrays.toString(ch));


        //2 way

//        Random random=new Random();
//        char[] arr1 = new char[random.nextInt(22-2+1)+2];
//
//        for (char j = 0; j < arr1.length; j++) {
//            arr1[j] = (char) ('A' + Math.random()*26);
//        }
//        System.out.print("Generated Random Character: " + Arrays.toString(arr1));
    }
}
