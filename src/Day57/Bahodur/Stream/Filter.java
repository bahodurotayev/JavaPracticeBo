package Day57.Bahodur.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter {
    public static void main(String[] args) {

        List<String> names = Arrays.asList("Reflection","Collection","Stream");
        System.out.println(names);

        List<String> strings = filterStream(names);
        System.out.println("strings = " + strings);
        List<String> filterName = names.stream().filter(s -> s.startsWith("S")).toList();
        System.out.println(filterName);
    }
    static List<String> filterStream(List<String> str){

        List<String> filterStream = new ArrayList<>();

        for (int i = 0; i < str.size(); i++) {
           if(str.get(i).startsWith("S")){
               filterStream.add(str.get(i));
           }
        }
        return filterStream;
    }
}
