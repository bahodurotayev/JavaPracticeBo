package day40.Task1;

public class City {
    private  String name;
    private  int areaZipCode ;

    private City() {
        this.areaZipCode = 10020;
    }

    public City(String name) {
        this();
        this.name = name;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", areaZipCode=" + areaZipCode +
                '}';
    }
}
