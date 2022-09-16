package Day15.Practice.Bahodur;

import java.util.Scanner;

public class BoTask5 {
    public static void main(String[] args) {
         /*
    Task5.
Using Scanner, provide two random numbers (max 100) and one of following operators (+, -, , /, %, .)
if operator = +, return total of numbers.
if operator = -, return absolute difference of numbers.
if operator =, multiply numbers
if operator = /, divide numbers
if operator = %, return remainder of number
if operator = ., return decimal numbers (example: number1=10, number2=20, return = 10.20
if any = return -1.
     */

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1 = ");
        int number1 = scan.nextInt();
        System.out.print("Enter number 2 = ");
        int number2 = scan.nextInt();
        scan.nextLine();
        System.out.print("Enter Operator = ");
        String operator = scan.nextLine();


//        if(operator.equals("+")){
//            System.out.println("Operator is  " + operator + " Result " + (number1 + number2));
//        } else if (operator.equals("-")) {
//            System.out.println("Operator is  " + operator + " Result " + (Math.abs(number1) - Math.abs(number2)));
//        }else if (operator.equals("*")) {
//            System.out.println("Operator is  " + operator + " Result " + (Math.abs(number1) * Math.abs(number2)));
//        }else if (operator.equals("/")) {
//            System.out.println("Operator is  " + operator + " Result " + (Math.abs(number1) / Math.abs(number2)));
//        }else if (operator.equals("%")) {
//            System.out.println("Operator is  " + operator + " Result " + (Math.abs(number1) % Math.abs(number2)));
//        }else if (operator.equals(".")) {
//            System.out.println("Operator is  " + operator + " Result " + number1+operator+number2);
//        }

        switch (operator){
            case "+" : System.out.println("Operator is  " + operator + " Result " + (number1 + number2));break;
            case "-" : System.out.println("Operator is  " + operator + " Result " + (Math.abs(number1) - Math.abs(number2)));break;
            case "*" : System.out.println("Operator is  " + operator + " Result " + (Math.abs(number1) * Math.abs(number2)));break;
            case "/" : System.out.println("Operator is  " + operator + " Result " + (Math.abs(number1) / Math.abs(number2)));break;
            case "%" : System.out.println("Operator is  " + operator + " Result " + (Math.abs(number1) % Math.abs(number2)));break;
            case "." : System.out.println("Operator is  " + operator + " Result " + number1+operator+number2);break;
            default  : System.out.println("-1"); break;

        }
    }
}
