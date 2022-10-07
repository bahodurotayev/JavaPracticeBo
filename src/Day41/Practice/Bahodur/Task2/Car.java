package Day41.Practice.Bahodur.Task2;

import java.util.ArrayList;

public class Car {
    public double price;
    public String brand;
    public String model;
    public int inventory;
    public int kmh;
    public int mph;
    private final double mileToKilometerConverter = 1.609344;
    private static  int counter = 0;

   private void convertMileToKm(){
       this.kmh = (int)(this.mph *  mileToKilometerConverter);
   }

   private Car(){
       this.inventory = counter++;
    }


    public Car(double price, String brand, String model, int mph) {
        this();
        this.price = price;
        this.brand = brand;
        this.model = model;
        this.mph = mph;
        convertMileToKm();
    }

    @Override
    public String toString() {
        return "Car{" +
                ", inventory=" + inventory +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", mph=" + mph +
                ", kmh=" + kmh +
                "price=" + price +
                '}';
    }
}
