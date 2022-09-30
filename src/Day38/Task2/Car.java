package Day38.Task2;

public class Car {
    String brand;
    String color;
    int age;


    public Car createCar (String brand, String color, int age) {
        Car car = new Car();
        car.color = color;
        car.age = age;
        car.brand = brand;

        return car;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
