package day5;

public class taskUsingMethod {
    public static void main(String[] args) {

        sumOfReminders(222);
    }
    public static void sumOfReminders(int number){

        System.out.println("Number is ->" + number);


        int total = 0 ;
        int divider = 10;
        int reminder = 0;

        reminder = number%divider;
        total += reminder;

        number /= divider;

        reminder = number%divider;
        total +=reminder;

        number /= divider;
        reminder = number%divider;
        total += reminder;

        System.out.println("Total of number is " + total);
    }
}
