package Day44.Bahodur.Task1;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaMath {

   public static int getTotal(int number){
       int total = 0;
        for (int i = 0; i <= number; i++) {
            total += i;
        }
        return total;
    }

    public static String firstLetter (ArrayList<String> list, String firstLetter){

       String temp = "";

        for (int i = 0; i <list.size() ; i++) {
            if(list.get(i).contains(firstLetter)){
                return list.get(i);
            }
        }
        return null;
    }

}
