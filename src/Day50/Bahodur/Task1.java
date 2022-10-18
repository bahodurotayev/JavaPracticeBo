package Day50.Bahodur;

import java.util.Scanner;

public class Task1 {
    /*  Task2:
        Create a random password generator.
        1. Password should be minimum 16 characters
        2. Password should have 4 Capital letter.
        3. Password should have 4 lower case letter.
        4. Password should have 4 numbers.
        5. Password should have 4 special character.
        Example: Qe4$Os5!De1$Oe3&*/
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your passCode -> ");


        Boolean isStrongPassWord = true;
        while (isStrongPassWord) {
            try {
                String passWord = scan.nextLine();
                passwordSize(passWord);
                passwordWith4Capitals(passWord);
                passwordWith4lowerLetter(passWord);
                passwordWith4Numbers(passWord);
                passwordWith4SpecialChar(passWord);
                System.out.println("you have strong password!!! ");
            } catch (Exception e) {
                System.out.println("Please try strong password");
            }
        }
    }
    public static boolean passwordSize(String passWord) throws Exception {
        if(passWord.length() < 15){
            throw new Exception("Password should be minimum 16 characters");
        }
        return true;
    }
    public static boolean passwordWith4Capitals(String passWord) throws Exception {
        if(passWord.replace("[^A-Z]", "").length() < 3){
            throw new Exception("Password has less Capital letter characters");
        }
        return true;
    }
    public static boolean passwordWith4lowerLetter(String passWord) throws Exception {
        if(passWord.replace("[^a-z]", "").length() < 3){
            throw new Exception("Password has less lower letter ");
        }
        return true;
    }
    public static boolean passwordWith4Numbers(String passWord) throws Exception {
        if(passWord.replace("[0-9]", "").length() < 3){
            throw new Exception("Password has less numeric numbers");
        }
        return true;
    }
    public static boolean passwordWith4SpecialChar(String passWord) throws Exception {
        if(passWord.replace("^a-zA-Z0-9]", "").length() < 3){
            throw new Exception("Password has less special character");
        }
        return true;
    }
}
