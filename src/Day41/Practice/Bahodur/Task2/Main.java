package Day41.Practice.Bahodur.Task2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(20000, "Toyota", "Camry", 35);
        Car car2 = new Car(65000, "BMW", "M3", 100);
        Car car3 = new Car(20000, "Subaru", "WRX", 75);

        Inventory inventory = new Inventory();
        inventory.carList.add(car1);
        inventory.carList.add(car2);
        inventory.carList.add(car3);

        System.out.println(inventory.carList);

    }
}
