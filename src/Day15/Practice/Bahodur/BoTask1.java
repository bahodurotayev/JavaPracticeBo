package Day15.Practice.Bahodur;

import java.util.Arrays;
import java.util.Scanner;

public class BoTask1 {
    public static void main(String[] args) {
              /*      Generate two numbers btw 0 and 10.
        if both numbers have same remainder when divided by 3, return which ever is smaller.
        if both numbers dont have same remainder when divided by 3, return whichever is larger.
        if both numbers are equal, return sum of numbers;

*/

        Scanner scan  = new Scanner(System.in);
        System.out.print("Enter number 1 = ");
        int num1 = scan.nextInt();
        System.out.print("Enter number 2 = ");
        int num2 = scan.nextInt();

//        if (num1 == num2){
//            System.out.println("Sum of number " + (num1 + num2));
//        }
//        else if(num1 % 3  == num2 % 3 ){
//            System.out.println("Printing smallest = " + Math.min(num1, num2));
//        } else if (num1 % 3 != num2 % 3) {
//            System.out.println("Printing  largest = " + Math.max(num1,num2));
//        }

        String result = num1 == num2 ? "Sum of number" + (num1 + num2)
                :num1 % 3  == num2 % 3 ?"Printing smallest = " + Math.min(num1, num2)
                :num1 % 3 != num2 % 3  ?"Printing  largest = " + Math.max(num1,num2) : "";

        System.out.println(result);
    }
}
