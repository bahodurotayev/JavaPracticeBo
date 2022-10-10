package Day44.Bahodur.Task3.portfolio;

import Day44.Bahodur.Task3.crypto.Bitcoin;
import Day44.Bahodur.Task3.crypto.Ethereum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class BuyCrypto {
    private static int transactionId = 0;
    private static final HashMap<String, ArrayList<Double>> portfolio = new HashMap<>();
    private static final ArrayList<Bitcoin> bitcoinTransactionList = new ArrayList<>();
    private static final ArrayList<Ethereum> ethereumTransactionList = new ArrayList<>();

    public BuyCrypto(String crypto, double amount) {
        transactionId ++;
        if(crypto.equals("bitcoin")){
            Bitcoin bitcoin = new Bitcoin(amount);
            bitcoin.transactionId = transactionId;
            bitcoinTransactionList.add(bitcoin);
            portfolio.put(Bitcoin.shortName, new ArrayList<>(Arrays.asList(Bitcoin.getTotalAmount(), Bitcoin.getTotalValue())));
        } else if (crypto.equals("ethereum")) {
            Ethereum ethereum = new Ethereum(amount);
            ethereum.transactionId = transactionId;
            ethereumTransactionList.add(ethereum);
            portfolio.put(Ethereum.shortName, new ArrayList<>(Arrays.asList(Bitcoin.getTotalAmount(), Bitcoin.getTotalValue())));
        }
    }
    public static void printTransactionDetails(){
        System.out.println("====================Transactions====================");
        for (Bitcoin eachBitcoin: bitcoinTransactionList ) {
            System.out.println(eachBitcoin);
        }
        for (Ethereum eachEthereum: ethereumTransactionList) {
            System.out.println(eachEthereum);
        }
    }

    @Override
    public String toString() {
        return "Portfolio={" + portfolio + "}";
    }
}
