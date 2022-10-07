package Day41.Practice.Bahodur.StaticTask1;

public class Task1 {
    public static void main(String[] args) {

        Employee employee = new Employee();
        Employee.employeeId = 20;


        System.out.println("=============================");

        Employee employee1 = new Employee();
        employee1.name = "BO";
        employee1.num = 27;
        Employee.employeeId = 300;
        System.out.println(employee1);

        System.out.println("=============================");



    }
}
class Employee{

   public static int employeeId;
    int num;
    public String name;

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", num=" + num +
                ", name='" + name + '\'' +
                '}';
    }
}
