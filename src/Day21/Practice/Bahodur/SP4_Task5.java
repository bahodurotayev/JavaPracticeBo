package Day21.Practice.Bahodur;

import java.util.Arrays;
import java.util.Random;

public class SP4_Task5 {
    public static void main(String[] args) {
            /*Task5:
        Create a char array
        The array has a random length between 2 and 22 (inclusive)
        The array should only have random capital letters.
        Print the array.*/

        Random rnd = new Random();
        char[] ch =new char[rnd.nextInt(2, 23)];
        String character = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i <ch.length ; i++) {
            ch[i] = character.charAt(rnd.nextInt(0, 27));
        }
        System.out.println(Arrays.toString(ch));
    }
}
