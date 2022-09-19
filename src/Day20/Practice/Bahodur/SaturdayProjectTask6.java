package Day20.Practice.Bahodur;

import java.util.Arrays;

public class SaturdayProjectTask6 {
    /*
        Task6:
        Given a String array as ["bird", "dog", "cat", "door"]
        Create a new array named as arrRev.
                Reverse the order of the elements of the String array and store in the arrRev.
        Print the arrRev
        Sample:
        Given ["bird", "dog", "cat", "door"] -> prints ["door", "cat", "dog" , "bird"]
 */
    public static void main(String[] args) {
        String[] str = {"bird", "dog", "cat", "door"};
        String[] reverse = new String[str.length];
        System.out.println(Arrays.toString(str));

        for (int i = 0, j = str.length-1; i <reverse.length ; i++, j--) {
            reverse[i] = str[j];
        }
        System.out.println(Arrays.toString(reverse));
    }
}
