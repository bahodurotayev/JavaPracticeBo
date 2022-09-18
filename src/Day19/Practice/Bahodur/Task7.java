package Day19.Practice.Bahodur;

public class Task7 {
    public static void main(String[] args) {

        /*Task4
         * Given an array of integers {6, 9, 1, 0, 8};
         * return true if 6 appears as either the first or last element in the array.
         * */

        int num[] = {6, 9, 1, 0, 8};
        int equal= 61;

        boolean bl = false;
        for (Integer number:num
             ) {
            if(number == equal)
                bl = true;
        }
        System.out.println(bl);
    }
}
