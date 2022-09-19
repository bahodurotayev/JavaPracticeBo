package Day20.Practice.Bahodur;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SaturdayProjectTask10 {
    public static void main(String[] args) {
         /*
    Task10:
        Create a String array. The length of array should be the count of Exelenter students.
        Use scanner class to Enter Students names and insert them into the array.
        Use Random class, to generate number(index) between 0 and length of array.
        Return the name of the student, whose name is stored under the generated index.
        Print: WINNER IS + <<Student Name>>!!! (All capital letters)
        Example:
        [Anthony, Arthur, Andrea, Malika, Bahridin, Sebahattin, Dilnoza, Mehmet, Tohir, Mustafa]

        if random number is 0, print WINNER IS ANTHONY!!!!
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Students name = ");
        String[] arr = new String[6];

        for (int i = 0; i <arr.length ; i++) {
            arr[i] = scan.nextLine().toUpperCase();
        }
        Random rn = new Random();
        int randomMumber = rn.nextInt(0, arr.length);
        System.out.println(Arrays.toString(arr));
        System.out.println("The winner is " + arr[randomMumber]);

    }
}
