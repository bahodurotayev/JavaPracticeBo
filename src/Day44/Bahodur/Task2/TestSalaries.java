package Day44.Bahodur.Task2;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestSalaries {

    @Test
    public void totalWage(){

        double baseSalary = 6500;
        double hourRate = 20;
        double extraHour = 12;
        double totalWage = baseSalary + (hourRate * extraHour) * 1.5;
        Employee employee = new Employee(baseSalary, hourRate);
        Assert.assertEquals(totalWage, employee.calculateWage(12));
        Assert.assertEquals(1, Employee.getNumberOfEmployees());

    }
}
