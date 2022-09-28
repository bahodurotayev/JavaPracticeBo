package Day36.Bahodur.Practice.Example1;

public class OOPTask1 {
    public static void main(String[] args) {

        Student student1Info = creatingStudentInfo("Bahodur", "Otayev",34, "111-333-4444", "Male");
        printStudentInfo(student1Info);

    }
    static void printStudentInfo(Student student){
        System.out.println(student.name);
        System.out.println(student.lastName);
        System.out.println(student.age);
        System.out.println(student.phone);
        System.out.println(student.gender);
    }
    static Student creatingStudentInfo(String name, String lastName){
        Student student1 =new Student();
        student1.name = name;
        student1.lastName = lastName;

        return student1;
    }

    static Student creatingStudentInfo(String name, String lastName, int age, String phone, String gender){
        Student student1 =new Student();
        student1.name = name;
        student1.lastName = lastName;
        student1.age = age;
        student1.phone = phone;
        student1.gender= gender;

        return student1;
    }
}
class Student{
    String name;
    String lastName;
    int age;
    String phone;
    String gender;
}
