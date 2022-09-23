package Day31.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Example {

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,3,3,3,4,4,4,5,5,5,6));
        HashSet<Integer> set = new HashSet<>(list);
        list = new ArrayList<>(set);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 2, 4, 6, 3, 12, 5,6, 8, 1, 4, 7));
        HashSet<Integer> set2 = new HashSet<>(list2);
        list2 = new ArrayList<>(set2);
        System.out.println(list2);

        // To remove all duplicates from the list, by using hashset
    }
}
