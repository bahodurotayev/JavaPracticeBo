package Day34.Practice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ufuktask4 {
    /*Task 4
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
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter a number for sum: ");
        int num = scan.nextInt();

        validate(listele(),num);

    }

    static ArrayList<Integer> listele(){
        ArrayList<Integer> list=new ArrayList<>();
        Random rn=new Random();
        for (int i = 0; i < 10; i++) {
            int number= rn.nextInt(0,10);
            list.add(number);
        }
        System.out.println("list: "+list);
        return list;
    }

    static boolean validate(ArrayList<Integer> list, int x){
        boolean tf=false;
        for (int i = 0; i < list.size(); i++) {
            for (int j = i+1; j <list.size() ; j++) {
                if((list.get(i)+list.get(j))== x){
                    tf=true;
                    System.out.println(list.get(i)+"+"+list.get(j)+"="+(list.get(i)+list.get(j)));
                    break;
                }
            }
        }
        System.out.println("Result = " + tf);
        return tf;
    }
}
