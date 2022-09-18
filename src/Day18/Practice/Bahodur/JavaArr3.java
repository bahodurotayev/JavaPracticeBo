package Day18.Practice.Bahodur;

public class JavaArr3 {
    public static void main(String[] args) {

        // 1A 1B 1C 2A 2B 2C 3A 3B 3C
        // if we have character C, break outer loop
        String str = "ABCDE";

       outer: for (int i = 1; i <=5 ; i++) {
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(j) == 'C'){
                    break outer;
                }
                System.out.print(i + "" + str.charAt(j) + " ");
            }
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("======================");

        outer2 :for (int i = 1; i <=5 ; i++) {
            for (int j = 0; j <str.length() ; j++) {
                if(str.charAt(j) == 'C' || str.charAt(j) == 'D' || str.charAt(j) == 'E'){
                    continue ;
                }
                System.out.print(i + "" + str.charAt(j) + " ");
            }

        }

    }
}
