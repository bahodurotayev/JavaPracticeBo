package Day29.Practice.Bahodur;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrayListRemoveAll {
    public static void main(String[] args) {


        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14));
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        list2.removeAll(list1);

        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);

    }
}
