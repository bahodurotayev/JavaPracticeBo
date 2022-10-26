package Day56.Bahodur.Task2.Commercial;

public class Taxi extends Commercial{
    private String medallionNumber;
    private String driverName;

    public Taxi(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    public Taxi(String brand, String model, int speed, String medallionNumber, String driverName) {
        super(brand, model, speed);
        this.medallionNumber = medallionNumber;
        this.driverName = driverName;
    }

    public Taxi(String brand, String model, int speed, double pricePerMile, double insurancePrice, String medallionNumber, String driverName) {
        super(brand, model, speed, pricePerMile, insurancePrice);
        this.medallionNumber = medallionNumber;
        this.driverName = driverName;
    }

    public String getMedallionNumber() {
        return medallionNumber;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setMedallionNumber(String medallionNumber) {
        this.medallionNumber = medallionNumber;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public double getPricePerMile() {
        return super.pricePerMile;
    }

    @Override
    public void setPricePerMile(double pricePerMile) {
         super.pricePerMile = pricePerMile;
    }

    @Override
    public double getInsurancePrice() {
        return super.insurancePrice;
    }

    @Override
    public void setInsurancePrice(double insurancePrice) {
        super.insurancePrice =insurancePrice;
    }

    @Override
    public int getNumberOfPassenger() {
        return super.numberOfPassenger;
    }

    @Override
    public int getSpeed() {
        return super.speed;
    }

    @Override
    public double getGasConsumption() {
        return super.gasConsumption;
    }

    @Override
    public void setNumberOfPassenger(int numberOfPassenger) {
        super.numberOfPassenger = numberOfPassenger;
    }

    @Override
    public void setGasConsumption(double gasConsumption) {
        super.gasConsumption = gasConsumption;
    }

    @Override
    public String getBrand() {
        return super.brand;
    }

    @Override
    public String getModel() {
        return super.model;
    }



    @Override
    public void print() {
        System.out.println(getClass().getSimpleName() + " : " +
                "medallionNumber='" + medallionNumber + '\'' +
                ", driverName='" + driverName + '\'' +
                ", pricePerMile=" + pricePerMile +
                ", insurancePrice=" + insurancePrice +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", numberOfPassenger=" + numberOfPassenger +
                ", gasConsumption=" + gasConsumption
                );
    }

}
