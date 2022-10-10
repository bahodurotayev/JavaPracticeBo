package Day44.Bahodur.Task3.market;

import Day44.Bahodur.Task3.portfolio.BuyCrypto;

public class Market {
    public static void main(String[] args) {
        BuyCrypto bitcoin1 = new BuyCrypto("bitcoin", 1.2);
        BuyCrypto bitcoin2 = new BuyCrypto("bitcoin", 1.2);
        BuyCrypto ethereum3 = new BuyCrypto("ethereum", 1);


        System.out.println(ethereum3);


        BuyCrypto.printTransactionDetails();
    }
}
