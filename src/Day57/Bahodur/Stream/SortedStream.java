package Day57.Bahodur.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortedStream {
    public static void main(String[] args) {

        List names = Arrays.asList("Reflection","Collection","Stream");
        Collections.sort(names);
        System.out.println(names);

        System.out.println("================================");

        List<String> names2 = Arrays.asList("Reflection","Collection","Stream");
        List<String> result = names2.stream().sorted().collect(Collectors.toList());
        System.out.println(result);

        List<String> str = new ArrayList<>();
        str.add("bbbb");
        str.add("aaaa");
        str.add("cccc");

        for(int i = 0; i < str.size(); i++)
        {
            for (int j = i+1; j < str.size(); j++)
            {
                if(str.get(i).compareTo(str.get(j))< 0)
                {

                    String temp = str.get(i);
                    str.set(i, str.get(j));
                    str.set(j, temp);

                }
            }
        }

        System.out.println(str);  //this will print cccc,bbbb,aaaa

    }
}
