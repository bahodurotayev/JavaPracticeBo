package Day34.Practice.Bahodur;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Task4_01 {
    /* Task 4
        1. Create a method which will return ArrayList<Integer> with no parameters.
           Add 10 random numbers between 0 and 10 to the list.

        2. Create a method which will return true or false.
           Parameter is ArrayList<Integer>, and int (X).
           Determine whether there exist two elements in the list whose sum is exactly X.
          Example:
          {1, 4, 45, 6, 10, 8} and X = 16
          Result = true;
          {1, 2, 4, 3, 6} and X = 11
          Result = false;*/

    static ArrayList<Integer> listOfRandom (){
        Random rnd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        while (list.size() < 10){
            list.add(rnd.nextInt(0, 11));
        }
        return list;
    }
    static Boolean checkSumTwo(ArrayList<Integer> list, int num){

        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j <list.size()-1 ; j++) {
                if(list.get(i) + list.get(j) == num && i != j){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = listOfRandom();
        System.out.println(list);

        Boolean sumTwo = checkSumTwo(list, 15);
        System.out.println("sumTwo = " + sumTwo);

    }
}
