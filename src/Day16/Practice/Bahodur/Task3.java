package Day16.Practice.Bahodur;

public class Task3 {
    public static void main(String[] args) {
        // Create a multiplication table only of number 2.
        // 1*2 = 2
        // 2*2 = 4
        // 3*2 = 6

         int total = 0;
        for (int i = 1, j = 2; i <= 10 ; i++) {

            total = i * j;
            System.out.println(i + " * " + j +" = " + total);
        }

    }
}
