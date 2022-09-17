package Day16.Practice.Bahodur;

public class Task2 {
    public static void main(String[] args) {

        int number = 123123;
        String numberStr = Integer.toString(number);
        String newStr = "";

        for (int i = numberStr.length()-1; i >=0 ; i--) {
            newStr+=numberStr.charAt(i);
        }
        System.out.println(numberStr.equals(newStr));
    }
}
