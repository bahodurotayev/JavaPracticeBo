package Day10.Practice;

import java.util.Scanner;

public class Bahodur {
    public static void main(String[] args) {
         /*
    use scanner
    enter 1 string
    enter 1 int

    if int is within string length, then substring from beginning to the number provided
    if int is not within the string length, then substring last 3 characters.

    Example1: World, 3 ===> output should be Worl
    Example2: World, 6 ===> output should be rld
     */
//
//        Scanner scan = new Scanner(System.in);
//        System.out.print("Enter String ->");
//        String str = scan.nextLine();
//
//        System.out.println();
//
//        System.out.print("Enter Integer ->");
//        int i = scan.nextInt();
//
//        String result = "";
//
//
//        if(i < str.length()){
//            result=str.substring(0, i);
//            System.out.println(result);
//        }else
//            System.out.println( str.substring(str.length()-3));


        //EnterInteger();
       // StringEqual();
       // Task1();
      //  System.out.println(Task2(10));
      //  System.out.println(Task3(4));
        //System.out.println(Task4(8));
        System.out.println(Task5("$ads15","$asd20","-$asd50"));

   }

    static void EnterInteger(){
         /*
       Use scanner
       enter 3 numbers
       if all numbers are equal, return sum of the numbers
       if one of the numbers is not equal, return product of the numbers
       if any of number is negative, then return 0
        */

        Scanner scan = new Scanner(System.in);

        int i1; int i2; int i3;
        System.out.print("Enter first number -> ");
        i1 = scan.nextInt();
        System.out.print("Enter second number -> ");
        i2 = scan.nextInt();
        System.out.print("Enter third number -> ");
        i3 = scan.nextInt();

        int total;

        if (i1==i2 && i2==i3 && i1>0){
            total = i1 + i2 + i3;
            System.out.println("Sum of numbers is -> " + total);
        } if ((i1!=i3 || i2!=i3 || i1!=i2) && i1>0 && i2>0 && i3>0) {
            total = i1 * i2 * i3;
            System.out.println("Product of numbers is -> " + total);
        }if(i1 < 0 || i2 < 0 || i3 < 0) {
            total = 0;
          System.out.println("Negative -> " + total);
      }
    }


    static void StringEqual(){
        /*
    Create a scanner
    enter two strings
    if the length of the strings are equal, print "The lengths are equal"
    if the length of the string are not equal, print "The lengths are not equal"
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter str1 ->");
        String str1 = scan.nextLine();
        System.out.println("Enter str2 ->");
        String str2 = scan.nextLine();

        if(str1.length() == str2.length()){
            System.out.println("Lengths are equal");
        }else
            System.out.println("Lengths are not equal");
    }
    static void Task1() {
      /*Task1
        * Given an int ,
            if the age is less than or equal 10
                print "too young to create a Facebook account"
             if the age is less than or equal 16
                print "too young to get a driver's license"
             if the age is less than or equal 18
                print "too young to get a tattoo"
            if the age is less than or equal 21
                print "too young to drink alcohol"
            if the age bigger than 21
                print "do whatever you want to do"
        * */
        int age;
        int fb = 10;
        int li = 16;
        int ta = 18;
        int al = 21;


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your age -> ");
        age = scan.nextInt();
        if(age <= fb){
            System.out.println("Too young to create a Facebook");
        }if(age <= li){
            System.out.println("Too young to get a license");
        }if(age <= ta){
            System.out.println("Too young to get a tattoo");
        }if(age < al){
            System.out.println("Too young to drink alcohol");
        }if (age >= al){
            System.out.println("Free to live  your life");
        }

    }
    static boolean Task2(int num) {
        /*Task2
         Given an int number. Check if the number is even or not
        if the number is even print true
        if the number is odd print false
        result should be true or false.
        * */
        System.out.println("Given number -> " + num);

        if(num %2 != 0){
            return false;
        }
        return true;
    }

    static String Task3(int num){

         /*
         Given an int  ,
            if the int is 1 print Monday
            if the int is 2 print Tuesday
            if the int is 3 print Wednesday
            if the int is 4 print Thursday
            if the int is 5 print Friday
            if the int is 6 print Saturday
            if the int is 7 print Sunday
            if the number is bigger than or equal to 8 or less than 1 then print "This is not a valid day."
         */
        System.out.println("Given number ->" + num);
        if(num == 1)
            return "Monday";
        if (num == 2)
            return  "Tuesday";
        if(num == 3)
            return "Wednesday";
        if (num == 4)
            return "Thursday";
        if (num == 5)
            return "Friday";
        if(num == 6)
            return "Saturday";
        if(num == 7)
            return "Sunday";
        return "Invalid day";
    }

    static String Task4(int num){
            /*
Given an int number
            -print "fizz" when given number is divisible by 5
            -print "buzz" when given number is divisible by 3
            -print "fizzbuzz" when given number is divisible by both 3 and 5
            -print same number if it is not divisible by 3 or 5
        Examples:
            input1 -> 10 | output1 -> fizz
            input2 -> 9  | output2 -> buzz
            input3 -> 30 | output3 -> fizzbuzz
            input4 -> 7  | output4 -> 7
 */

        System.out.println("Given number is -> " + num);

        if(num % 3 == 0 && num % 5 == 0)
            return "fizzbuzz";
        if(num % 3 == 0)
            return "buzz";
        if (num % 5 == 0)
            return "Fizz";
        return "" +num;
    }


    static String Task5(String s1, String s2, String s3) {
        /**Task5
         *  Given three positive numbers as a String with a space between numbers beginning with a symbol or a letter
         *         i.e. "$15 $20 $30" or "%3 %121 %67" or "€90 €123 €23987"
         *         remove all the non-numeric characters.
         *         parse the Strings to int
         *         and print the total
         *         Example:
         *         String num1 = "$15";
         *         String num2 = "$20";
         *         String num3 = "$30";
         *         output should be ==> 65;
         *         NOTE : if the output is less than 0 change the output to -1
         */
        int sum = 0;
        int i1;
        int i2;
        int i3;

        System.out.println("Given Strings are -> "+" "+ s1 + " " + s2 + " " + s3);

        i1 = Integer.parseInt(s1.replaceAll("[^\\d-]", ""));
        i2 = Integer.parseInt(s2.replaceAll("[^\\d-]", ""));
        i3 = Integer.parseInt(s3.replaceAll("[^\\d-]", ""));

        sum = i1 + i2 + i3;


        if (sum < 0)
            return "-1" ;
        return "output is ->" + sum;
    }
}
