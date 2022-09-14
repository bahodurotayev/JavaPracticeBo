package Day11.Practice;

import java.util.Scanner;

public class Bahodur {
    public static void main(String[] args) {
        System.out.println(NestedIfElse());
    }
    static String NestedIfElse(){
        int num;

        Scanner scan = new Scanner(System.in);
        System.out.print("Given grade is -> ");
        num= scan.nextInt();


        if(num >=90) {
            if (num >= 95) {
                return "A+";
            }
            else
            return "A-";
        } else if (num >80) {
            if (num >85 ){
                return "B+";
            }else {
                return "B-";
        }
    } else if (num > 70) {
            if (num > 75){
                return "C+";
            }else {
                return "C-";
            }

        } else if (num >60) {
            if (num >65){
                return "B+";
            }else {
                return "B-";
            }
        }
        return "F";
    }
}
