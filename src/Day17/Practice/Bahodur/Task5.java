package Day17.Practice.Bahodur;

public class Task5 {
    public static void main(String[] args) {
        // Write program using nested loops that prints:
        // *
        // **
        // ***
        // ****
        // *****

       String str = "*";
        String s = "";
        for (int i = 0; i <5 ; i++) {
            s +=str;
            System.out.println(s);
        }

        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*");
                if(i <= j){
                break;
                }
            }
            System.out.println();
        }
    }
}
