package Day52.Bahodur.Task2;

public class Movie {
    private String name;
    private int releaseYear;
    private double rentPrice;
    private double buyPrice;

    public Movie(String name, int releaseYear, double rentPrice, double buyPrice) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.rentPrice = rentPrice;
        this.buyPrice = buyPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
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
                ", releaseYear=" + releaseYear +
                ", rentPrice=" + rentPrice +
                ", buyPrice=" + buyPrice +
                '}';
    }
}
