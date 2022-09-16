package Day15.Practice.Bahodur;

import java.util.Random;
import java.util.Scanner;

public class BoTask2 {
    public static void main(String[] args) {
         /*
        Task2:
        Create a random password generator.
        1. Password should be minimum 16 characters
        2. Password should have 4 Capital letter.
        3. Password should have 4 lower case letter.
        4. Password should have 4 numbers.
        5. Password should have 4 special character.

        Example: Qe4$Os5!De1$Oe3&
          */

//        Random rnd = new Random();
//
//        String pwd = "";
//        String capitals = "ABCDEFGHIJKLMNOPRSTUWXYZ";
//        String lowerCase = "abcdefghijklmnoprstuwxyz";
//        String specialChars = "!#$%&()*+,-.:;<=>?@[]^_{|}~";
//
//        while (pwd.length()< 16){
//            pwd += capitals.charAt(rnd.nextInt(capitals.length()));
//            pwd += lowerCase.charAt(rnd.nextInt(lowerCase.length()));
//            pwd += specialChars.charAt(rnd.nextInt(specialChars.length()));
//            pwd += rnd.nextInt(10);
//        }
//        System.out.println(pwd);

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter passCode = ");
        String passCode = scan.nextLine();
        System.out.println();

        int capitalCount = passCode.replaceAll("[A-Z]", "").length();
        int lowerCount = passCode.replaceAll("[^a-z]", "").length();
        int numbCount = passCode.replaceAll("[0-9]", "").length();
        int specialCount = passCode.replaceAll("[\\p{P}\\p{S}]", "").length();

        if(passCode.length() >= 16 && capitalCount >= 4 && lowerCount >= 4 && numbCount >= 4 && specialCount >= 4){
            System.out.println("Strong Password");
        }else{
            System.out.println("Invalid Password");
        }
    }
}
