package Day19.Practice.Bahodur;

import java.util.Arrays;

public class JavaEnhancedForLoop {

    public static void main(String[] args) {
        String str[] = {"Furkat", "Malike", "Andrea", "Tony"};
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println("===============================");
        for (String eachElement: str
             ) {
            System.out.println(eachElement);
        }
    }
}
