package Day37.HomeWorkBahodur.Task1;

import Day37.HomeWorkBahodur.Task1.Company;
import Day37.HomeWorkBahodur.Task1.Employee;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Company company = new Company();
        company = populateCompany("Apple corp", "www.apple.com", 500);

        Employee employee = populateEmployee("John", 1232, company);
        Employee employee1 = populateEmployee("Wick", 4533, company);
        Employee employee2 = populateEmployee("Tommy", 3424, company);
        Employee employee3 = populateEmployee("Ronda", 4567, company);
        // printEmployee(employee);

        ArrayList<Employee> employeesList = new ArrayList<>();
        employeesList.add(employee);
        employeesList.add(employee1);
        employeesList.add(employee2);
        employeesList.add(employee3);

        printListOfEmployee(employeesList);

    }
    static Employee populateEmployee(String name, int id, Company company){

        Employee employee = new Employee();
        employee.name = name;
        employee.id = id;
        employee.company = company;

        return employee;
    }

    static Company populateCompany(String companyName, String website, int numOfEmployees ){

        Company company = new Company();

        company.companyName =companyName;
        company.numOfEmployees = numOfEmployees;
        company.website = website;

        return company;
    }
    static void printEmployee(Employee employee){
        System.out.println(employee.name + " : " +
                            employee.id + " : " +
                            employee.company.companyName + " : " +
                employee.company.website + " : " +
                employee.company.numOfEmployees);
    }
    static void printListOfEmployee(ArrayList<Employee> list){

        for (int i = 0; i < list.size(); i++) {
            printEmployee(list.get(i));
        }
    }

}
