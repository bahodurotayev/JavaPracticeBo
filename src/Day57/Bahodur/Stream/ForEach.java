package Day57.Bahodur.Stream;

import java.util.ArrayList;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<String> str = new ArrayList<>();
        str.add("bbbb");
        str.add("aaaa");
        str.add("cccc");

        str.stream().forEach(x -> System.out.println(x));
    }
}
