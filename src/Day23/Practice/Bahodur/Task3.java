package Day23.Practice.Bahodur;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
          /*Task10:
        Create a String array. The length of array should be the count of Exelenter students.
        Use scanner class to Enter Students names and insert them into the array.
        Use Random class, to generate number(index) between 0 and length of array.
        Return the name of the student, whose name is stored under the generated index.
        Print: WINNER IS + <<Student Name>>!!! (All capital letters)
        Example:
        [Anthony, Arthur, Andrea, Malika, Bahridin, Sebahattin, Dilnoza, Mehmet, Tohir, Mustafa]

        if random number is 0, print WINNER IS ANTHONY!!!!
        */
        String[] strArr = new String[6];
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        System.out.print("Enter students name : ");
        System.out.println();
        int randomArr = rnd.nextInt(0, strArr.length);

        for (int i = 0; i <strArr.length ; i++) {
            strArr[i] = scan.nextLine();

        }

        System.out.println(Arrays.toString(strArr));
        System.out.println("Winner is " + strArr[randomArr]  + " !!!");



    }
}
