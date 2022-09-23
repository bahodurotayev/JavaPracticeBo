package Day31.Java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class JavaSets {
    public static void main(String[] args) {

        HashSet<Integer> set = new HashSet<>();


        set.add(1);
        set.add(2);
        set.add(3);
        set.add(5);
        set.add(7);
        set.add(1);

        System.out.println("set = " + set);

        Set<Integer> changeToset  = set;
        System.out.println("changeToset = " + changeToset);
        set.add(10);
        changeToset.add(11);
        System.out.println("changeToset = " + changeToset);
        Set<Integer> set1 = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,1,2,3,4,5,6));
        System.out.println("list =>" + list);
        set1.addAll(list);

        System.out.println("set1 => " + set1);




    }
}
