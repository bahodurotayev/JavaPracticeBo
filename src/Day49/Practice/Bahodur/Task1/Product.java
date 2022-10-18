package Day49.Practice.Bahodur.Task1;

public enum Product {
    COMPUTER("Macbook", 1000.50, 1200.30),
    PHONE("Iphone", 800.40, 875.95),
    TABLET("Ipad", 250, 285.35),
    PLAYSTATION("PS4", 450.10, 500.05);

    private final String productName;
    private final double buyPrices;
    private final double sellPrices;

    Product(String productName, double buyProduct, double sellProduct) {
        this.productName = productName;
        this.buyPrices = buyProduct;
        this.sellPrices = sellProduct;
    }

    public String getProductName() {
        return productName;
    }

    public double getBuyProduct() {
        return buyPrices;
    }

    public double getSellPrices() {
        return sellPrices;
    }
}
