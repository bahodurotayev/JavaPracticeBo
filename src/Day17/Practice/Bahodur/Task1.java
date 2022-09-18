package Day17.Practice.Bahodur;

public class Task1 {
    public static void main(String[] args) {
        /*
    create multiplication table from 1 to 10
     */

        for (int i = 1; i <=10 ; i++) {
            for (int j = 1; j <=9 ; j++) {
                System.out.println(i + " * " + j + " = " + (i*j));

            }
            System.out.println("");
        }
    }
}
