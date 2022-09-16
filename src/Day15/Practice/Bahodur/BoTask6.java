package Day15.Practice.Bahodur;

import java.util.Scanner;

public class BoTask6 {
    public static void main(String[] args) {
                   /*Task6.
Using scanner create a string.
Return reverse of a string.
Example: str = Java, result should be = avaJ
*/


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter string = ");
        String str = scan.nextLine();
        int count = str.length();
        while (count > 0){
            System.out.print(str.charAt(count-1));
            count--;
        }

        char a = 'b';
        char b = 'a';
        char c = 'v';
        char d = 'a';

        String result = "";
        System.out.println(result);
    }
}
