package Day49.Practice.Bahodur.Task1;

import java.util.HashMap;

import static Day49.Practice.Bahodur.Task1.TransactionType.BUY;

public class Transaction {
    public static double totalUSDAmount;
    public static final HashMap<String, Integer> stock = new HashMap<>();
    private double transactionAmount;

    public static void addFunds(double addFund){
        totalUSDAmount += addFund;
    }
    public static void processTransaction(TransactionType transactionType, Product product, int qty){
        Transaction transaction = new Transaction();
        switch (transactionType){
            case BUY : transaction.transactionAmount = product.getBuyProduct() * qty;
            transaction.buyProduct(product, qty);
            break;
            case SELL: transaction.transactionAmount = product.getSellPrices() * qty;
            transaction.sellProduct(product, qty);
            break;
        }
    }
    private void buyProduct(Product product, int qty){
        if(qty <= 0){
            System.out.println("Wrong amount do not take any action");
        } else {
            if (this.transactionAmount > totalUSDAmount) {
                System.out.println("Your purchase amount is " + this.transactionAmount);
                System.out.println("Yor available balance is " + totalUSDAmount);
                System.out.println("Not enough funds to cover your purchase. Please try less qty or add more funds. ");
            } else {
                totalUSDAmount -= this.transactionAmount;
                stock.put(product.getProductName(), stock.getOrDefault(product.getProductName(), 0) + qty);
            }
        }
    }
    private void sellProduct(Product product, int qty){
        if(qty <= 0){
            System.out.println("Wrong amount do not take any action");
        } else {
            if (stock.get(product.getProductName()) < qty) {
                System.out.println("Your stock for " + product.getProductName() + " is " + product.getSellPrices());
                System.out.println("You don`t have enough stock. Please try less qty");
            } else {
                totalUSDAmount += this.transactionAmount;
                stock.put(product.getProductName(), stock.getOrDefault(product.getProductName(), 0) - qty);
            }
        }
    }
    public static void print(){
        System.out.println("Total USD is : " + totalUSDAmount);
        System.out.println("Stock : " + stock);
    }
}
