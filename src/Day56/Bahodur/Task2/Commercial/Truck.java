package Day56.Bahodur.Task2.Commercial;

public class Truck extends Commercial{

    String licenseId;
    String company;

    public Truck(String brand, String model, int speed) {
        super(brand, model, speed);
    }

    public Truck(String brand, String model, int speed, double pricePerMile, double insurancePrice) {
        super(brand, model, speed, pricePerMile, insurancePrice);
    }

    public String getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(String licenseId) {
        this.licenseId = licenseId;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getCompany() {
        return company;
    }

    @Override
    public double getPricePerMile() {
        return super.pricePerMile;
    }

    @Override
    public void setPricePerMile(double pricePerMile) {
        super.pricePerMile = pricePerMile;
    }

    @Override
    public double getInsurancePrice() {
        return super.insurancePrice;
    }

    @Override
    public void setInsurancePrice(double insurancePrice) {
        super.insurancePrice = insurancePrice;
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
    public void print() {
        System.out.println(getClass().getSimpleName() + " : " +
                "licenseId='" + licenseId + '\'' +
                ", company='" + company + '\'' +
                ", pricePerMile=" + pricePerMile +
                ", insurancePrice=" + insurancePrice +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", speed=" + speed +
                ", numberOfPassenger=" + numberOfPassenger +
                ", gasConsumption=" + gasConsumption);
    }

}
