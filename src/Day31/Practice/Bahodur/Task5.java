package Day31.Practice.Bahodur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Task5 {
    public static void main(String[] args) {

        /*
    Create a method with the parameter and return type of List of Lists of Character.
    Method should return the characters in desc order.

    Example:
    {c, a, b, e, y} => output = > {y, e, c, b, a}
     9.00 - 9.10
     */

        ArrayList<Character> list = new ArrayList<>(Arrays.asList('c', 'a', 'b', 'e', 'y'));
        HashSet<Character> charr = charactersInOrder(list);
        System.out.println(charr);

    }
    static HashSet<Character>charactersInOrder(ArrayList<Character> charr){
        HashSet<Character> newChar = new HashSet<>();

        for (int i = charr.size()-1; i >=0 ; i--) {
            newChar.add(charr.get(i));
        }
        return newChar;
    }
}
