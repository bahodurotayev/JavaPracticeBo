package Day24.Practice.Bahodur;

public class Task3 {
    public static void main(String[] args) {
        // create a method which will take int varargs as parameter and return total
        Task3 t3 = new Task3();
        int total = t3.getTotal(5, 5 ,5 ,5 );
        System.out.println(total);
    }
    int getTotal(int... varargs){
        int total = 0;
        for (int eachElement:varargs) {
            total += eachElement;
        }
        return total;
    }

}
