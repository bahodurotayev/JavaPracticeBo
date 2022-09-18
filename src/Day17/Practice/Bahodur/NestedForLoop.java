package Day17.Practice.Bahodur;

public class NestedForLoop {
    public static void main(String[] args) {

        String str = "ABC";
        int num = 5;

        for (int i = 0; i <str.length() ; i++) {
            for (int j = 1; j <=5 ; j++) {
                System.out.print(str.charAt(i)+ ""+j);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
