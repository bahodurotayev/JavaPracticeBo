package Day13.Practice;

import java.util.Scanner;

public class Bahodur {
    public static void main(String[] args) {


        // Task3  validate if your string contains " "
        // if true print you have multiple words, if false -> you have single word

//        String str = "baha a";
//        String single = "a";
//        String result = str.contains(" ") ? str : single;

        // System.out.println(result);
        // System.out.println(example2());
        //System.out.println(task3());

    }

    static int example1(){
        int result = 0;
        int number1 ;
        int number2 ;
        String operation;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number1 = ");
        number1 = scan.nextInt();
        System.out.print("Enter number2 = ");
        number2 = scan.nextInt();
        scan.nextLine();
        System.out.print("Operation = ");
        operation = scan.nextLine();

        if(operation.equalsIgnoreCase("plus")){
            result = number1 + number2;
        }else if(operation.equalsIgnoreCase("minus")){
            result = number1 - (number2);
        } else if (operation.equalsIgnoreCase("multiply")) {
            result = number1 * number2;
        }else if (operation.equalsIgnoreCase("divide")){
            result = number1 / number2;
        }
        System.out.print("Result is = ");
        return result;
    }

    static int example2(){
        int result = 0;
        int number1 ;
        int number2 ;
        String operation;

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number1 = ");
        number1 = scan.nextInt();
        System.out.print("Enter number2 = ");
        number2 = scan.nextInt();
        scan.nextLine();
        System.out.print("Operation = ");
        operation = scan.nextLine();

        result = operation.equalsIgnoreCase("plus") ? number1 + number2
                : operation.equalsIgnoreCase("minus") ? number1 -number2
                : operation.equalsIgnoreCase("multiply") ? number1 * number2
                : operation.equalsIgnoreCase("divide") ? number1 > number2 ? number2 == 0 ? -1 : number1 / number2 : number2 / number1
                :-1;

        return result;
    }

    static String task1() {
 /*
    Task 1
    Using scanner get int between 0 - 24
    if time is between 7 - 20 print Good Day, else print Good night
     */
        Scanner scan = new Scanner(System.in);
        int time;
        System.out.print("Enter time = ");
        time = scan.nextInt();
        String output = (time > 7 && time < 20)? "Good day" : "Good night";
        return output;
    }
    static String task2() {
 /*
    Task 2
    Using scanner get int between 0 - 24
    if time is between 7 - 20 print Good Day,
    if time is between 7 - 12 print Good Morning,
    else print Good night
     */
        Scanner scan = new Scanner(System.in);
        int time;
        System.out.print("Enter time = ");
        time = scan.nextInt();
        String output = (time > 7 && time < 20)? (time <= 12) ?"Good morning " : "Good day" : "Good night";
        return output;
    }
    static String task3() {
 /*
    Task 3
    Using scanner get int between 0 - 24
    if time is between 7 - 20 print Good Day,
    if time is between 7 - 12 print Good Morning,
    if time is between 20 - 22 print Good Evening,
    else print Good night
     */
        Scanner scan = new Scanner(System.in);
        int time;
        System.out.print("Enter time = ");
        time = scan.nextInt();
        String output = (time >= 7 && time <= 20) ? (time <= 12) ? "Good morning " : "Good day"
                : time > 20 && time < 22 ? "Good evening" : "Good night";
        return output;
    }
    static String passCodeCheck(){
         /* Task password checker
        Create a password.
        1. password should be minimum 8 character
        2. password should have minimum 1 Capital letter.
        3. password should have minimum 1 lower case letter.
        4. password should have minimum 1 special character.

        if password meets requirement, return "Strong password"
        else return "Invalid password"
         */

        Scanner scan = new Scanner(System.in);
        String strong = "Strong passcode";
        String invalid = "Invalid passcode";
        System.out.print("Enter passcode = ");
        String passCode = scan.nextLine();

        boolean passCodeMin = passCode.length() > 8;
        System.out.println(passCodeMin);


        return "";
    }
}
