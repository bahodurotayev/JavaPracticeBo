package Day52.Bahodur.Task4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Movie {
    private String name;
    private LocalDate year;
    private double rentPrice;
    private double buyPrice;

    public Movie(String name, String year, double rentPrice, double buyPrice) {
        this.name = name;
        this.year = LocalDate.parse(year, DateTimeFormatter.ofPattern("MM dd yyy"));
        this.rentPrice = rentPrice;
        this.buyPrice = buyPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getYear() {
        return year;
    }

    public void setYear(LocalDate year) {
        this.year = year;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "name='" + name + '\'' +
                ", year=" + year +
                ", rentPrice=" + rentPrice +
                ", buyPrice=" + buyPrice +
                '}';
    }
}
