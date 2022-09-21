package Day24.Practice.Bahodur;

public class Task2 {
    // Create a void method which will have a String (student name) and int varargs (grade) as parameters.
    // print name of the student, and average of the grades.
    // (Furkat Ali, 50,60,70) => Furkat Ali : 60

    static void students(String name, int...varargs){
        int total = 0;
        for (int i = 0; i < varargs.length; i++) {
            total +=varargs[i];
        }
        int avg = total/3;
        System.out.println("Student is : " + name + "Average of grades is : " +avg);
    }

    public static void main(String[] args) {
        students("Furkat", 50, 60, 70);
    }
}