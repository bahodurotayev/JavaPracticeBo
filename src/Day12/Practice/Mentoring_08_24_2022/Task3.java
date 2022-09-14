package Day12.Practice.Mentoring_08_24_2022;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {



        Scanner scan = new Scanner(System.in);
        String result ="";

        System.out.print("Input any number: ");
        int n = scan.nextInt();    //1000

        String nToString = String.valueOf(n); // 1000
        int len = nToString.length();  // len = 4

        if (len < 4){
            result = nToString;
        } else {
            result = nToString.substring(0,len-3) + "," + nToString.substring(len-3);
        }

        System.out.println("result = " + result);

    }
}
