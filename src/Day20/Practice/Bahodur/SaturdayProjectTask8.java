package Day20.Practice.Bahodur;

import java.util.Arrays;

public class SaturdayProjectTask8 {
    public static void main(String[] args) {
         /*
     Task8:
        Given a String as "$15.2  156.00 €25.4 £16.4 654.9 ₺54.1 $105.2 €55.8 £23.7 ₺1658.10 $236.2 €30 35.43 £18.54 ₺754.132"
        if a price starts with $, multiply with 3.5
        if a price starts with €, multiply with 4.2
        if a price starts with £, multiple with 6.7
        if a price starts with ₺, multiply with 1.8
        if a price doesnt start with any currency, return it`s own value.
        1. Get total of each currency`s prices.
        2. Get total of all prices.
     */
        String strArr = "$15.2  156.00 €25.4 £16.4 654.9 ₺54.1 $105.2 €55.8 £23.7 ₺1658.10 $236.2 €30 35.43 £18.54 ₺754.132";
        String[] newStrArr = strArr.split(" ");
        System.out.println(Arrays.toString(newStrArr));
        double dollarTotal = 0.0;
        double euroTotal = 0.0;
        double poundTotal = 0.0;
        double liraTotal = 0.0;
        double empty = 0.0;

        for (int i = 0; i < newStrArr.length; i++) {
            if (newStrArr[i].contains("$")) {
                newStrArr[i] = newStrArr[i].replace("$", "");
                dollarTotal += Double.parseDouble(newStrArr[i]);
            } else if (newStrArr[i].contains("€")) {
                newStrArr[i] = newStrArr[i].replace("€", "");
                euroTotal += Double.parseDouble(newStrArr[i]);
            } else if (newStrArr[i].contains("£")) {
                newStrArr[i] = newStrArr[i].replace("£", "");
                poundTotal += Double.parseDouble(newStrArr[i]);
            } else if (newStrArr[i].contains("₺")) {
                newStrArr[i] = newStrArr[i].replace("₺", "");
                liraTotal += Double.parseDouble(newStrArr[i]);
            }

        }
        System.out.println("dollarTotal = " + dollarTotal * 3.5);
        System.out.println("euroTotal = " + euroTotal * 4.2);
        System.out.println("poundTotal = " + poundTotal * 6.7);
        System.out.println("liraTotal = " + liraTotal * 1.8);

    }
}
