package Day56.Bahodur.Task2;

import Day56.Bahodur.Task2.Commercial.Taxi;
import Day56.Bahodur.Task2.Commercial.Truck;
import Day56.Bahodur.Task2.Public.PublicTransportation;
import Day56.Bahodur.Task2.Public.Train;



public class City {


    static Taxi taxi;
    static Truck truck;
    static Train train;
    static {
        taxi = new Taxi("Toyota", "Camry", 240);
        taxi.setPricePerMile(1.18);
        taxi.setDriverName("Bo");
        taxi.setInsurancePrice(360);
        taxi.setMedallionNumber("T684972C");
        taxi.setGasConsumption(20);
        taxi.setNumberOfPassenger(3);
    }
    static {
        truck = new Truck("Black Beauty", "Ford F-250", 160, 0.75, 750);
        truck.setGasConsumption(12);
        truck.setNumberOfPassenger(2);
        truck.setCompany("AmazonPlus");
        truck.setLicenseId("2313536");
    }


    static {

        train = new Train("Atlas", "Thomas", 180);
        train.setGasConsumption(20);
        train.setNumberOfPassenger(25);
        train.setWorkingHours(36);
        train.setLane(PublicTransportation.Lane.BROOKLYN);
        train.setWorkingShift(PublicTransportation.WorkingShift.DAY);
        train.setPricePerRide(2.75);
    }
    public static void main(String[] args) {
        taxi.print();
        truck.print();
        train.print();
    }
}
