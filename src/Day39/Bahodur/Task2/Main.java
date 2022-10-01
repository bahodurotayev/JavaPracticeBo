package Day39.Bahodur.Task2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Bank chase = new Bank();
      //  System.out.println(chase);

        Bank bOfA = new Bank("Bank of America", "www.bofa.com");
        System.out.println(bOfA);



        Bank td = new Bank("TD Bank", "www.td.com", true);

        Branch nyBranch = new Branch(111, 11214);
        Branch njBranch = new Branch(101, 11209);

        ArrayList<Branch> branches = new ArrayList<>(Arrays.asList(njBranch, nyBranch));

        Bank city = new Bank("City", "www.city.com", branches);
        System.out.println(city);

    }
}
