package day5;

public class practice1 {
    public static void main(String[] args) {
        int i = 0;
        ++i;
        System.out.println(i);
        ++i;
        System.out.println(i);
        ++i;
        System.out.println(i);
        --i;
        System.out.println(i);
        System.out.println("Q4");

        // Question 3// using remainder print the last number. 1879
       // System.out.println(1879%10);
        //Question4
        // You have a number which 187469; Using arithmetical operators, calculate total of 1 + 8 + 7 + 9.
        // don`t do hard coding. sout (1 + 8 + 7 + 9)

        int total = 0;
        int divider = 10;
        int number = 1879;
        int reminder = number%divider;
        total+=reminder;
        System.out.println(total + "=>"+ reminder);
        number/=divider;
        reminder=number%divider;
        total+=reminder;
        System.out.println(total + "=>" + reminder);
        number/=divider;
        reminder=number%divider;
        total+=reminder;
        System.out.println(total + "=>" +reminder);
        number/=divider;
        reminder=number%divider;
        total+=reminder;
        System.out.println(total+ "=>"+reminder);

        System.out.println("Homework");
        // Task for homework.
        // calculate total of number 563. (dont use hardcoding) answer should be 14;

        int total2 = 0;
        int number2 =563;
        int divider2 = 10;
        int reminder2 = 0;

        System.out.println("Sum of each individual number = 5 + 6 + 3");

        reminder2=number2%divider2;
        total2 +=reminder2;
        System.out.println("First reminder is ->" + reminder2);
        System.out.println("Total is ->" + total2);

        number2/=divider2;
        reminder2 = number2%divider2;
        total2 +=reminder2;
        System.out.println("Second reminder is ->" + reminder2);
        System.out.println("Total is ->" + total2);


        number2/=divider2;
        reminder2 = number2%divider2;
        total2+=reminder2;
        System.out.println("Second reminder is ->" + reminder2);
        System.out.println("Total is ->" + total2);














    }
}
