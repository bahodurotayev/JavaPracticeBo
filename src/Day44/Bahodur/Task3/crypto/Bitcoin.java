package Day44.Bahodur.Task3.crypto;

public class Bitcoin {

    public static final String shortName = "BTC";
    private static double totalAmount;
    private static double totalValue;
    public int transactionId;
    public double transactionAmount;
    private final double price = 19540.09;
    public double transactionValue;

    public Bitcoin(double transactionAmount) {
        this.transactionAmount = transactionAmount;
        this.transactionValue = this.transactionAmount * price;
        totalAmount += transactionAmount;
        totalValue += transactionValue;
    }

    public static double getTotalValue(){
        return totalValue;
    }
    public static double getTotalAmount(){
        return totalAmount;
    }

    @Override
    public String toString() {
        return "Bitcoin{" +
                "transactionId=" + transactionId +
                ", transactionAmount=" + transactionAmount +
                ", price=" + price +
                ", transactionValue=" + transactionValue +
                '}';
    }
}
