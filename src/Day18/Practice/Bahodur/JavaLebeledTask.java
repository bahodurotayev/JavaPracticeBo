package Day18.Practice.Bahodur;

public class JavaLebeledTask {
    // "ABCDE"
    // name loops as outerloop (for numbers) and inner loop (for string)
    // print as 1A, 1B, 1C, 2A, 2B, 2C, etc...

    // Task1
    // if inner loop index of string equals 'D' or 'B', break inner loop

    public static void main(String[] args) {
        String str = "ABCDE";

        outer:for (int i = 1; i <=5 ; i++) {
            inner:for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == 'B' || str.charAt(j) == 'D'){
                    break inner;
                }
                System.out.print(i + ""+ str.charAt(j) +  " ");
            }
        }
    }
}
