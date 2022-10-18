package Day50.Bahodur;

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

    }
    public static boolean passwordSize(String passWord){
        if(passWord.length() >= 16){
            return true;
        }
        return false;
    }
    public static boolean passwordWith4Capitals(String passWord){
        if(passWord.length() <= 16){
            return true;
        }
        return false;
    }
}
