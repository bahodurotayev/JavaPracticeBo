package Day44.Bahodur.Task2;

public class Employee {
    double baseSalary;
    double hourlyRate;
    static int numberOfEmployees;

    public double wage;


    public Employee(){
    numberOfEmployees += 1;
    }

    public Employee(double baseSalary, double hourlyRate) {
        this();
     if(baseSalary <= 0 && hourlyRate < 0){
            this.hourlyRate = 14.20;
            this.baseSalary =this.hourlyRate * 40;
     }else {
         this.baseSalary = baseSalary;
         this.hourlyRate = hourlyRate;
     }
    }

    public double calculateWage(double extraHour){
        return this.wage = this.baseSalary + (this.hourlyRate * extraHour) * 1.5;
    }

    public static int getNumberOfEmployees(){
        return numberOfEmployees;
    }
}
