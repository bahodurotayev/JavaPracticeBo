package Day19.Practice.Bahodur;

public class Task6 {
    public static void main(String[] args) {
        /*
         *Task2
         * Create integer array {32, 17, 58, 42, 5}
         * Using Enhanced For Loop search specific number inside the array
         * If array contains that number return true, otherwise return false
         * Example: number = 12
         * Output: false
         * */

        int arr [] = {32, 17, 58, 42, 5};
        int number = 107;
        boolean bl = false;
        for (Integer enhArr:arr
             ) {
           if(number == enhArr){
               bl = true;
               break;
           }
            }
        System.out.println(bl);
    }
}
