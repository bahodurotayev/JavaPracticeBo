package Day53.Bahodur.Task2;

public class Employee {
    String name;
    double hourlyRate;
    double totalHours;

    public Employee() {
    }

    public Employee(String name, double hourlyRate, double totalHours) {
        this.name = name;
        this.hourlyRate = hourlyRate;
        this.totalHours = totalHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double getTotalHours() {
        return totalHours;
    }

    public void setTotalHours(double totalHours) {
        this.totalHours = totalHours;
    }

    public double calculateSalary(){
        return this.hourlyRate * this.hourlyRate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", totalHours=" + totalHours +
                ", calculate=" + calculateSalary() +
                '}';
    }
}
