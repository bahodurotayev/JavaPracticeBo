package Day34.Practice.Bahodur;



import java.util.*;

public class Task6 {
    /* Task 6.
         Given an ArrayList<Characters> as a parameter.
         {a b c e f a t d a l m u v x a e b d}
         1. Create a method to return ArrayList<Character> with the unique values and in the descending order.

         2. Create a method to return HashMap<Character, Integer>.
            The Parameter is ArrayList<Character>. (The list must be sorted in descending order have only unique values.)
            Add each character as a key to the map and its ASCII code as a value.

         3. Create a method which will have HashMap<Character, Integer> as a parameter and will return a double.
            Return the average of all values of a map. double number must have only 2 decimals. (Example: 10.25)*/

    static ArrayList<Character> uniqueChar (ArrayList<Character> list){
        ArrayList<Character> copy = new ArrayList<>(list);
        ArrayList<Character> newList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            char character = list.get(i);
            list.removeIf(eachChar -> eachChar != character);
            if(list.size() == 1){
                newList.add(list.get(0));
            }
            list = new ArrayList<>(copy);
        }
       TreeSet<Character> treeSet = new TreeSet<>(newList);
        newList = new ArrayList<>(treeSet);
        Collections.reverse(newList);
    return newList;
    }

    static HashMap<Character, Integer> charCode(ArrayList<Character> characters){
        HashMap<Character, Integer> charCode = new HashMap<>();
        for (int i = 0; i < characters.size(); i++) {
            charCode.put(characters.get(i), (int)characters.get(i));
        }
        return charCode;
    }

    static double getAverage(HashMap<Character, Integer> map){
        double avg = 0.0;


        for (Map.Entry<Character, Integer> value : map.entrySet()) {
            avg += value.getValue();
        }

        return avg/map.size();
    }

    public static void main(String[] args) {
        ArrayList<Character> list = new ArrayList<>(Arrays.asList('a' ,'b', 'c', 'e', 'f', 'a' ,'t' ,'d', 'a', 'l', 'm' ,'u', 'v', 'x', 'a' ,'e', 'b', 'd'));

        ArrayList<Character> unique = uniqueChar(list);
        System.out.println(unique);

        HashMap<Character, Integer> characterMap = charCode(unique);

        System.out.println(characterMap);

        double average = getAverage(characterMap);
        System.out.println("average = " + average);


    }
}
