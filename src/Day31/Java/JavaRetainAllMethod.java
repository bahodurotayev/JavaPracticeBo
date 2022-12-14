package Day31.Java;

import java.util.Arrays;
import java.util.HashSet;

public class JavaRetainAllMethod {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>(Arrays.asList(1,3,5,7,9));
        HashSet<Integer> set2 = new HashSet<>(Arrays.asList(1,2,4,5,6,7));

        set1.retainAll(set2);
        set2.retainAll(set1);
        System.out.println(set1);
        System.out.println(set2);

    }
}
