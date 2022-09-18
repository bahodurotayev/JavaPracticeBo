package Day19.Practice.Bahodur;

public class Task5 {
    public static void main(String[] args) {
        /*Task1
         * Write a Java program to find
         * the number of even and odd integers
         *  in a given array of integers {25, 71, 0, 40, 99};
         * */

        int num[] = {25, 71, 24, 40, 99};
        int odd = 0;
        int even = 0;

        for (int i = 0; i <num.length ; i++) {
            if(num[i] % 2 == 0){
                even++;
            }else {
                odd++;
            }
        }
        System.out.println("even = " + even);
        System.out.println("odd = " + odd);
    }
}
