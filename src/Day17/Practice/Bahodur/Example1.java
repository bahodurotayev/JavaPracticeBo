package Day17.Practice.Bahodur;

public class Example1 {
    public static void main(String[] args) {
      /*1 * 1 = 1
        1 * 2 = 2
        1 * 3 = 3
        1 * 4 = 4
        1 * 5 = 5
        2 * 1 = 2
        2 * 2 = 4
        2 * 3 = 6
        2 * 4 = 8
        2 * 5 = 10*/

        int outer = 2;
        int inner = 5;

        for (int i = 1; i <=outer ; i++) {
            for (int j = 1; j <=inner ; j++) {
                System.out.println(i +" * " + j + "= " + (i*j));
            }
            System.out.println();
        }
    }
}
