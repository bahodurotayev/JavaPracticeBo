package Day15.Practice.Bahodur;

import java.util.Scanner;

public class Bahodur {
    public static void main(String[] args) {
        /*
        create a string which is = Java is Fun;
        print each character of the string.


        String s ="Java is fun";
        int index = 0;

        while (index !=s.length()){
            System.out.print(s.charAt(index));
            index++;
            }*/

            /*
      return the total sum of all numbers until 10

        int num = 0;
        int sum = 0;
        while (num<=10){
            sum += num ++;
        }
        System.out.println(sum);
*/

         /*
    String str = "Just because the water is red doesn't mean you can't drink it."
    count of many letter 'a' you have in this sentence.

     String s = "Just because the water is red doesn't mean you can't drink it.";

        int count = 0;
        int index = 0;
        while (index < s.length()){
            if (s.charAt(index) == 'a'){
                count++;
            }
            index++;
        }

        System.out.println(count);*/

         /*


        Use scanner to provide two numbers. And using this numbers, replace Math.pow()
     */
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number = ");
        int number = scan.nextInt();

        System.out.print("Enter pow = ");
        int pow = scan.nextInt();

        int total = 1;
        int count = 0;

        do{
            total =total * number;
            count ++;
        }while (count < pow);

        System.out.println(total);
    }
}
