package Day57.Bahodur.Stream;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Collect {
    public static void main(String[] args) {
        List<Integer> number = Arrays.asList(2, 3, 4, 5, 2, 3 );
        Set<Integer> set = number.stream().map(x -> x*x).collect(Collectors.toSet());
        System.out.println("set = " + set);
    }
}
