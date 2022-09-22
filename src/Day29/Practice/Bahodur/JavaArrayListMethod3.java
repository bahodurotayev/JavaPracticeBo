package Day29.Practice.Bahodur;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrayListMethod3 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        System.out.println(list);
        boolean b = list == list2;
        System.out.println(b);

        boolean b1 = list.equals(list2);
        System.out.println(b1);

        ArrayList<Integer> list3 = list;
        list3.set(0, 100);
        list3.set(1, 200);
        System.out.println(list3);
    }
}
