package Day53.Bahodur.Task2;

public class SDET  extends  Employee{

    double overTime;

    public SDET(String name, double hourlyRate, double totalHours, double overTime) {
        super(name, hourlyRate, totalHours);
        this.overTime= overTime;
    }


    public double getOverTime() {
        return overTime;
    }

    public void setOverTime(double overTime) {
        this.overTime = overTime;
    }
    public double calculateSalary(){
        return this.hourlyRate * this.hourlyRate + (this.overTime * 1.5 * hourlyRate);
    }

    @Override
    public String toString() {
        return "SDET{" +
                ", name='" + name + '\'' +
                ", hourlyRate=" + hourlyRate +
                ", totalHours=" + totalHours +
                ", overTime=" + overTime +
                ", calculateSalary=" + calculateSalary() +
                '}';
    }
}
