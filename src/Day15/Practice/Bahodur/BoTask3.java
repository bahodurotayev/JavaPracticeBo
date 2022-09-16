package Day15.Practice.Bahodur;

import java.util.Random;

public class BoTask3 {
    public static void main(String[] args) {
                      /*Task3.
Using Random class, create a random number up to 100.
return count of numbers divisible by 8
*/
        Random rn = new Random();
      //  int randomNumber = rn.nextInt(101);
        int count = 0;
        int start = 1;

        System.out.println("Random number = " + 56);

        while (start <=56){
            if (start % 8 == 0 ){
                count ++;
            }
            start++;
        }
        System.out.println(count);
    }
}
