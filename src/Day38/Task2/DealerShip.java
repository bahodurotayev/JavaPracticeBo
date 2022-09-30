package Day38.Task2;

public class DealerShip {
    public static void main(String[] args) {

        Car car = new Car();

        Car car1 = car.createCar("Toyota", "White", 2007);
        Car car2 = car.createCar("BMW", "Black", 1985);

        System.out.println(car1);
        System.out.println(car2);
    }
}
