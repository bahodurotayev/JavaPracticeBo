package Day21.Practice.Bahodur;

import java.util.Arrays;

public class SP4_Task6 {
    public static void main(String[] args) {
          /*Task6:
        Given a String array as ["bird", "dog", "cat", "door"]
        Create a new array named as arrRev.
        Reverse the order of the elements of the String array and store in the arrRev.
        Print the arrRev
        Sample:
        Given ["bird", "dog", "cat", "door"] -> prints ["door", "cat", "dog" , "bird"]
        */
        String [] str = {"bird", "dog", "cat", "door"};

        String[] newStr = new String[str.length];

        for (int i = str.length-1, j = 0; i >=0 ; i--, j++) {
            newStr[j] = str[i];
        }
        System.out.println(Arrays.toString(newStr));
    }
}
