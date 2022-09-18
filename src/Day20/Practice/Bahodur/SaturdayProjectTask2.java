package Day20.Practice.Bahodur;

import java.util.Arrays;

public class SaturdayProjectTask2 {
    /*
        Task2:
        Given a string as "Peach Berry Orange WaterMelon Orange"
        1. Convert this string to String[]. Example: [Peach, Berry, Orange, WaterMelon, Orange]
        2. Write below logic:
        2.a If this string array contains "Orange" change all "Orange" to "Apple"
        3. Print the Array
        Example: Given [Peach, Berry, Orange, WaterMelon, Orange] -> prints [Peach, Berry, Apple, WaterMelon, Apple
        */
    public static void main(String[] args) {
        String str = "Peach Berry Orange WaterMelon Orange";
        str = str.toLowerCase();
        String replace = "";
        String[] strArr =str.split(" ");
        for (int i = 0; i <strArr.length ; i++) {
            if(strArr[i].contains("orange")){
               strArr[i] = "apple";
            }
        }
        System.out.println(Arrays.toString(strArr));
    }
}
