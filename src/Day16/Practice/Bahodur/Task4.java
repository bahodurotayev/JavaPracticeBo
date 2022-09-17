package Day16.Practice.Bahodur;

public class Task4 {
    public static void main(String[] args) {
        /*
   from 1 up to 10, print in one column all odd numbers, in the second column all even numbers.
     */

        for (int i = 1; i <=10 ; i+=2) {
            int j = i + 1;
            System.out.println(i + "    " + j);
        }
    }
}
