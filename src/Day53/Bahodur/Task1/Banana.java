package Day53.Bahodur.Task1;

public class Banana extends Fruit {
    private String storeAddress;

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }
    @Override
    public String toString() {
        return "\n" + getClass().getSimpleName() +"{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", address=" + storeAddress+
                '}';
    }

}
