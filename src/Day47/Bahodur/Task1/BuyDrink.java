package Day47.Bahodur.Task1;

import java.math.BigDecimal;

public class BuyDrink {

    Drink drink;
    double price;
    String details;
    int qty;
    double totalPrice;

    public BuyDrink(Drink drink,  int qty) {
        this.drink = drink;
        this.price = drink.getPrice();
        this.qty =qty;
        this.totalPrice = this.price * qty;
        this.details = ":" + drink + " has " + drink.calories + " calories";
    }

    @Override
    public String toString() {
        return "BuyDrink{" +
                "drink=" + drink +
                ", price=" + price +
                ", qty=" + qty +
                ", totalPrice=" + String.format("%.2f",totalPrice) +
                ", details='" + details + '\'' +
                '}';
    }
}
