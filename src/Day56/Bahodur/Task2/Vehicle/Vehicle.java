package Day56.Bahodur.Task2.Vehicle;

public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int speed;
    protected int numberOfPassenger;
    protected double gasConsumption;

    public Vehicle(String brand, String model, int speed) {
        this.brand = brand;
        this.model = model;
        this.speed = speed;

    }
    public abstract int getNumberOfPassenger();
    public abstract int getSpeed();
    public abstract double getGasConsumption();

    public abstract void setNumberOfPassenger(int numberOfPassenger);

    public abstract void setGasConsumption(double gasConsumption);
    public abstract String getBrand();

    public abstract String getModel();
    public abstract void print();

}
