package Day57.Bahodur.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class map {
    public static void main(String[] args){

        List<Integer> number = Arrays.asList(2, 3, 4, 5);
        List<Integer> list = squareAre(number);
        System.out.println("List : " + list);
        List<Integer> squareNumber = number.stream().map(x -> x*x).toList();
        //System.out.println(squareNumber);
    }
    static List<Integer> squareAre(List<Integer> number){
        List<Integer> squareList = new ArrayList<>();
        for (int i = 0; i < number.size(); i++) {
            squareList.add(number.get(i)*number.get(i));
        }
        return squareList;
    }
}
