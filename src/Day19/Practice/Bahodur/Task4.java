package Day19.Practice.Bahodur;

import java.util.Arrays;

public class Task4 {
    /*Task4
        Remove dollar sign from array elements and print updated array;
        output = "50", "150", "5", "18", "25"  9:35
        * */
    public static void main(String[] args) {

        String [] strArr = {"$50", "$150", "$5", "$18", "$25"};
        String newArr[] = new String[strArr.length];

        for (int i = 0; i <strArr.length ; i++) {
            String replace = strArr[i].replace("$", "");
            newArr[i] = replace ;
        }
        System.out.println(Arrays.toString(newArr));


        int total = 0;
        double avg;
        for (int i = 0; i <newArr.length ; i++) {
            total = total + (Integer.parseInt(newArr[i]));
        }
        System.out.println("total = " + total);
        avg = (double) total/newArr.length;
        System.out.println("avg = " + avg);

    }
}
