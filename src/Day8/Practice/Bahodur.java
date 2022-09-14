package Day8.Practice;

public class Bahodur {
    public static void main(String[] args) {
        //Task1: Write a Java program to get the character at the index 5
        // and last index within the String.

        String str = "Hello World";
        char index5 = str.charAt(5);
        char lastIndex = str.charAt(str.length()-1);
        System.out.println(index5);
        System.out.println(lastIndex);
    }
}
