package Day49.Practice.Bahodur.Task1;

public class Shop {
    public static void main(String[] args) {
        Transaction.addFunds(10000);
        Transaction.processTransaction(TransactionType.BUY, Product.COMPUTER, 5);
        Transaction.print();
    }
}
