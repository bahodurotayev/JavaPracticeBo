package Day29.Practice.Bahodur;

import java.util.ArrayList;
import java.util.Arrays;

public class JavaArrayListRemoveIf {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>(Arrays.asList(
                "Java",
                "Happy",
                "New York",
                "New Jersey",
                "Toronto"
        ));

        System.out.println(list);
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).startsWith("N")){
            list.remove(i);
            i--;
            }
        }
        System.out.println("list = " + list);

        list.add(2, "New York");
        list.add(3, "New Jersey");
        System.out.println("list = " + list);

        list.removeIf(eachElement -> eachElement.startsWith("N"));
        System.out.println("list = " + list);

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println("list2 = " + list2);
        list2.removeIf(eachNumber -> eachNumber<5);
        System.out.println("list2 = " + list2);
    }
}
