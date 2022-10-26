package Day56.Bahodur.Task2.NonCommercial;

public class PickUp extends NonCommercial{

    private int horsePower;

    public PickUp(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    public PickUp(String brand, String model, int speed, String plateNumber, double insurancePrice) {
        super(brand, model, speed, plateNumber, insurancePrice);
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    @Override
    public String getPlateNumber() {
        return null;
    }

    @Override
    public void setPlateNumber(String plateNumber) {

    }

    @Override
    public double getInsurancePrice() {
        return 0;
    }

    @Override
    public void setInsurancePrice(double insurancePrice) {

    }

    @Override
    public int getNumberOfPassenger() {
        return 0;
    }

    @Override
    public int getSpeed() {
        return 0;
    }

    @Override
    public double getGasConsumption() {
        return 0;
    }

    @Override
    public void setNumberOfPassenger(int numberOfPassenger) {

    }

    @Override
    public void setGasConsumption(double gasConsumption) {

    }

    @Override
    public String getBrand() {
        return null;
    }

    @Override
    public String getModel() {
        return null;
    }

    @Override
    public void print() {

    }
}
