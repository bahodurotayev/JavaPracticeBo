package Day47.Bahodur.Task1;


import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestProduct {
    @Test
    public void validateBalanceDue(){
        BuyDrink buyDrink = new BuyDrink(Drink.COLA, 5);
        BuyDrink buyDrink1 = new BuyDrink(Drink.COLA, 5);
        BuyDrink buyDrink2 = new BuyDrink(Drink.SPRITE, 3);

        Cart.cart.add(buyDrink);
        Cart.cart.add(buyDrink2);
        Cart.cart.add(buyDrink1);

        for (BuyDrink eachDrink: Cart.cart) {
            System.out.println(eachDrink);
        }
        double v = Cart.calculateBalanceDue();
        System.out.println(v);
    }
}
