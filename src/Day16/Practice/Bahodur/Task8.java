package Day16.Practice.Bahodur;

public class Task8 {
    public static void main(String[] args) {
         /*
    print all numbers from 0 to 50, except numbers divisible by 6
     */
        for (int i = 0; i <= 50 ; i++) {
            if(i % 6 == 0){
                continue;
            }
            System.out.print(i);
        }
    }
}
