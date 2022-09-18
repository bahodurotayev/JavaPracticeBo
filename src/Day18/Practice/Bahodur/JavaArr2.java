package Day18.Practice.Bahodur;

import java.util.Arrays;

public class JavaArr2 {
    public static void main(String[] args) {

        String st[] = new String[5];

        st[0] = "baha";

        System.out.println(Arrays.toString(st));

        String str2 = "Bahodur Otayev Tolibovich";
        String str2Array []=str2.split(" ");
        System.out.println(Arrays.toString(str2Array));


        String str3Array []=str2.split("");
        System.out.println(Arrays.toString(str3Array));

    }
}
