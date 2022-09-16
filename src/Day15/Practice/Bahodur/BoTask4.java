package Day15.Practice.Bahodur;

import java.util.Random;

public class BoTask4 {
    public static void main(String[] args) {
                       /*Task4.
Create random number between 1000 and 2000.
Using loop, count total of each number.
Example: randomNumber = 6457; result = 6+4+5+7
*/
        Random random = new Random();

        int randomNum = random.nextInt(2000+1-1000)+1000;
        int total = 0;
        int count = 0;
        System.out.println("Random number is = "+randomNum);

        do{
            total = total + (randomNum % 10);
            randomNum/=10;
            count ++;

        }while (count < 4);
        System.out.println("total = " + total);

    }
}
