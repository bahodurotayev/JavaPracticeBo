package Day15.Practice.Bahodur;

import java.util.Random;

public class BoTask7 {
    public static void main(String[] args) {

                    /*Task7.
Create random string, which has a length of 30 and all characters are lower case letters.
return a count of the most repeated character.
Example: flapoeplksldfalafaaafoiwefafsa === output should be 8, since a is the most repeated.
*/
        Random rn = new Random();
        String alphabetString = "abcdefghijklmnopqrstuvxyz";
        int lengthOfString = 0;

        String randomString = "";
        while (lengthOfString < 30){
            randomString = randomString + alphabetString.charAt(rn.nextInt(alphabetString.length()-1 +1));
            lengthOfString++;
        }
        System.out.println("Random String is -> " + randomString);

        String character = "";
        String duplicate = "";
        int countDuplicate = 0;
        int idex = 0;
        while (idex < randomString.length()){
            String current = Character.toString(randomString.charAt(idex));
            if(character.contains(current)){
                duplicate += current;
            }
            System.out.print(duplicate);
            character += current;

            idex++;
        }
        System.out.println();
        System.out.println("Duplicate = "+ duplicate);


    }
    static void RandomString (){
        Random random = new Random();
        int count = 0;
        String randomText = "";
        while (count < 31){
            char randomChar =(char)random.nextInt(97, 123);
            randomText += randomChar;
            count++;
        }
        System.out.println(randomText);

    }
}
