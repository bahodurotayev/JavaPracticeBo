package Day17.Practice.Bahodur;

public class Task4 {
    public static void main(String[] args) {
        /*
        print grid of "#" with 10 rows and 10 columns
         */

        String ch = "# ";
        for (int i = 0; i <=10 ; i++) {
            for (int j = 0; j <=10 ; j++) {
                System.out.print(ch);
            }
            System.out.println("");
        }

    }
}