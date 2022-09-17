package Day15.Practice.Bahodur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class BoTask8 {
    public static void main(String[] args) {
                        /*Task8.
Using scanner, create a number.
If number is palindromic, return true. else, return false.
Note: Palindromic number is the number, that remains the same when its digits are reversed.
Example:
12321 => true
12344321 => true
1236541 => false
*/

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number - ");
        int number = scan.nextInt();
        String convertedNumber = Integer.toString(number);
        System.out.println("Reverse number is -" +reverse(convertedNumber));

        if(convertedNumber.equals(reverse(convertedNumber))){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
    static String reverse (String str){
        int count = str.length();
        String newStr = "";
        while (count > 0){
            newStr +=str.charAt(count -1);
            count--;
        }

        return newStr;
    }
}
