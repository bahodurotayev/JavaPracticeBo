package Day56.Bahodur.Task2.Public;

public class Train extends PublicTransportation {

    private double workingHours;

    public Train(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    public Train(String brand, String model, int speed, Lane lane, WorkingShift workingShift, double pricePerRide) {
        super(brand, model, speed, lane, workingShift, pricePerRide);
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(double workingHours) {
        this.workingHours = workingHours;
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
    public Lane getLane() {
        return super.lane;
    }

    @Override
    public void setLane(Lane lane) {
        super.lane = lane;
    }

    @Override
    public WorkingShift getWorkingShift() {
        return super.workingShift;
    }

    @Override
    public void setWorkingShift(WorkingShift workingShift) {
        super.workingShift = workingShift;
    }

    @Override
    public double getPricePerRide() {
        return super.pricePerRide;
    }

    @Override
    public void setPricePerRide(double pricePerRide) {
        super.pricePerRide = pricePerRide;
    }
    @Override
    public void print() {
        System.out.println(getClass().getSimpleName() + " : " +
                "workingHours=" + workingHours +
                ", lane=" + lane +
                ", workingShift=" + workingShift +
                ", pricePerRide=" + pricePerRide +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", numberOfPassenger=" + numberOfPassenger +
                ", gasConsumption=" + gasConsumption);
    }
}
