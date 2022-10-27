package Day57.Bahodur.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectionAndList {
    public static void main(String[] args) {

        // Collect(Collector.toList()) is mutable
        //to.List() is not mutable

        List<String> string = new ArrayList<>(Arrays.asList("Hello")).stream().collect(Collectors.toList());
        string.add("Hi");
        System.out.println(string);


    }
}
