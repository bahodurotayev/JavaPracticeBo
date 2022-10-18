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
        String strongPassWord2 = createStrongPassWord2();
        System.out.println(strongPassWord2);
    }
public static String randomStrongPassWord(String passWord){
        Random rnd = new Random();
        String lowerLetter = "abcdefghijklmnoprstuwxyz";
        String capitalLetters = "ABCDEFGHIJKLMNOPRSTUWXYZ";
        String specialChar = "!#$%&()*+,-.:;<=>?@[]^_{|}~";
        while (passWord.length() < 16){
            passWord += lowerLetter.charAt(rnd.nextInt(lowerLetter.length()));
            passWord += capitalLetters.charAt(rnd.nextInt(capitalLetters.length()));
            passWord += specialChar.charAt(rnd.nextInt(specialChar.length()));
            passWord += rnd.nextInt(10);
        }
        return passWord;
    }
    public static String createStrongPassWord2(){
       Scanner scanner = new Scanner(System.in);
       String passWord = scanner.nextLine();

        int capitalCount = passWord.replaceAll("[A-Z]", "").length();
        int lowerLetterCount = passWord.replaceAll("[a-z]", "").length();
        int numericCount = passWord.replaceAll("[0-9]", "").length();
        int specialCount = passWord.replaceAll("[\\\\p{P}\\\\p{S}]", "").length();

        if(capitalCount >= 4 && lowerLetterCount >= 4 && numericCount >= 4 && specialCount >= 4){
            return "Strong Password !!!";
        }
        return "Not strong password try again ";
    }
}
