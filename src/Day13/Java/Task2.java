package Day13.Java;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
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

        String outPut = "";

        boolean passCodeMin = passCode.length() > 8;
        boolean passCodeCapitalLetter = passCode.replaceAll("[A-Z]", "").length() == passCode.length();
        boolean passCodeLowerCase = passCode.replaceAll("[a-z]", "").length() == passCode.length();
        boolean passCodeSpecialChar = passCode.replaceAll("[\\p{P}\\p{S}]", "").length() == passCode.length();

        if(passCodeMin){
            System.out.println("Less than 8");
        } else if (passCodeCapitalLetter) {
            System.out.println("Has no capital");
        } else if (passCodeLowerCase) {
            System.out.println("Has no lower");
        } else if (passCodeSpecialChar) {
            System.out.println("Has no special char");
        }else
        System.out.println(strong);
    }
}
