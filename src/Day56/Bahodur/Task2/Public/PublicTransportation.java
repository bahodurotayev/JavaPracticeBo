package Day56.Bahodur.Task2.Public;

import Day56.Bahodur.Task2.Vehicle.Vehicle;


public abstract class PublicTransportation extends Vehicle {
    public enum Lane {
        MANHATTAN, QUEENS, STATEN_ISLAND, BROOKLYN, BRONX
    }
    public enum WorkingShift {
        MORNING, DAY, EVENING, NIGHT
    }
    protected Lane lane;
    protected  WorkingShift workingShift;
    protected double pricePerRide;

    public PublicTransportation(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    public PublicTransportation(String brand, String model, int speed, Lane lane, WorkingShift workingShift, double pricePerRide) {
        super(brand, model, speed);
        this.lane = lane;
        this.workingShift = workingShift;
        this.pricePerRide = pricePerRide;
    }

    public abstract Lane getLane();

    public abstract void setLane(Lane lane);

    public abstract WorkingShift getWorkingShift();

    public abstract void setWorkingShift(WorkingShift workingShift);

    public abstract double getPricePerRide();

    public abstract void setPricePerRide(double pricePerRide);
}
