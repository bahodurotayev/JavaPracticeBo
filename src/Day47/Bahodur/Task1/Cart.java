package Day47.Bahodur.Task1;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    final static List<BuyDrink> cart = new ArrayList<>();
    static double balanceDue;

    public static double calculateBalanceDue(){
        for (int i = 0; i < cart.size(); i++) {
            balanceDue += cart.get(i).totalPrice;
        }
        balanceDue = Double.parseDouble(String.format("%.2f",balanceDue));
        return balanceDue;
    }
}
