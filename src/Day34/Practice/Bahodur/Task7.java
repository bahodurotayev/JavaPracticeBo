package Day34.Practice.Bahodur;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Random;

public class Task7 {
    /* Task 7.
           Create 2 HashSet<Characters> objects.
           Keep adding random lowercase letters to the set until the size of each set is 10.

           1. Create a method to return the ArrayList of unique characters both of the sets have.
           2. Create a method to return the ArrayList of shared characters both of the sets have.
           3. Create a method to return the ArrayList of characters which are only in the first set.*/

    static HashSet<Character> addRandomCharacter(){
        Random rnd = new Random();
        HashSet<Character> randomCharacter = new HashSet<>();

        for (int i = 0; i < 100; i++) {
            if(randomCharacter.size() != 10) {
                randomCharacter.add((char) rnd.nextInt(97, 123));
            }
        }
        return randomCharacter;
    }
    static ArrayList<Character> uniqueOfTwo(HashSet<Character> object1, HashSet<Character> object2){
        object2.addAll(object1);
        ArrayList<Character> uniqueList = new ArrayList<>();
//        for (Character character: object2) {
//            uniqueList.add(character);
//        }
        uniqueList.addAll(object2);
        return uniqueList;
    }
    static ArrayList<Character> onlyFirstSet(HashSet<Character> object1, HashSet<Character> object2){

        ArrayList<Character> listOfFirstSet = new ArrayList<>();
        ArrayList<Character> tem1 = new ArrayList<>(object1);
        ArrayList<Character> tem2 = new ArrayList<>(object2);

        for (int i = 0; i <tem1.size(); i++) {
            for (int j = 0; j <tem2.size() ; j++) {
                if(tem1.get(i) == (tem2.get(j))){
                    listOfFirstSet.add(tem1.get(i));
                }
            }
        }

        return listOfFirstSet;
    }

    public static void main(String[] args) {
        HashSet<Character> object1 = addRandomCharacter();
        HashSet<Character> object2 = addRandomCharacter();

        System.out.println("object1 = " + object1);
        System.out.println("object2 = " + object2);

        ArrayList<Character> uniqueList = uniqueOfTwo(object1, object2);
        System.out.println("uniqueList = " + uniqueList);

        ArrayList<Character> listOfFirstSet = onlyFirstSet(object1, object2);
        System.out.println("listOfFirstSet = " + listOfFirstSet);




    }
}
