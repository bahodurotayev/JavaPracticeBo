package Day16.Practice.Bahodur;

public class Task5 {
    public static void main(String[] args) {
        /*
    return count of numbers divisible by 8 between 0 and 100
     */

        int count = 0;
        for (int i = 8; i <= 100; i++) {

            if(i % 8 == 0){
                count++;
                System.out.print(i+ ", ");
            }
        }
        System.out.println("\nCount is "+count);
    }
}
