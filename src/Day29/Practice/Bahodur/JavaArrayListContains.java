package Day29.Practice.Bahodur;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrayListContains {
    public static void main(String[] args) {

        int[]arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int length = arr.length;
        System.out.println("length = " + length);

        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8));
         int size = list.size();
        System.out.println("size = " + size);

        boolean contain5 = list.contains(5);
        System.out.println("contain5 = " + contain5);

        boolean contains = list.contains(11);
        System.out.println("contains = " + contains);

        Integer integer = list.get(list.size()-2);
        System.out.println(integer);

    }
}
