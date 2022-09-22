package Day29.Practice.Bahodur;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrayListMethod {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("aba", "dad", "add"));
        list.add("qwe");
        list.add(0, "yob");
        list.add(list.size(), "tob");
        System.out.println(list);

        System.out.println("====================================================");

        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(list);
        System.out.println(list2);

        list2.add("difference");
        System.out.println(list2);

        ArrayList<String> list3 = new ArrayList<>();
        for (String each:list2) {
            list3.add(each);
        }
        System.out.println(list3);
    }
}
