package Day17.Practice.Bahodur;

public class Task8 {
    /*
    * * * * *
     * * * *
     * * *
     * *
     *
     */
    public static void main(String[] args) {

        String str = "*";
        String store = "";
        for (int i = 5; i > 0; i--) {
            for (int j = i; j > 0; j--) {
                System.out.print(str);
            }
            System.out.println();
        }
    }
}
