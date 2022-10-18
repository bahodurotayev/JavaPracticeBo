package Day50.Bahodur;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter email address : ");
        String str = scanner.nextLine();
        try {
            check(str);
            System.out.println("You have valid email address");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }


    }
    public static boolean check(String str) throws Exception {
        if(!str.contains("@")){
            throw new Exception("You have invalid email address");
        }
        return true;
    }
}
