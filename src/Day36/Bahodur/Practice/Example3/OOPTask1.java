package Day36.Bahodur.Practice.Example3;

import java.util.Random;

public class OOPTask1 {
    public static void main(String[] args) {

        Student newStudent = new Student();

        Info newInfo = new Info();
        newInfo.name = "John";
        newInfo.lastName = "Wick";
        newInfo.phone = "231-356-4534";
        newInfo.age = 26;
        newInfo.email = "johnwick@gmail.com";
        newInfo.address = "123 york st";

        School newSchool = new School();
        newSchool.schoolAddress = "123 lincoln st";
        newSchool.schoolName = "PS 205";
        newSchool.schoolTuition = 2500;
        newSchool.web = "ps205.gov.NY";
        newSchool.schoolEmail = "ps205@lincoln.com";

        newStudent.school = newSchool;
        newStudent.info = newInfo;


        }
    }

class Info{
    String name;
    String lastName;
    int age;
    String phone;
    int id = new Random().nextInt(9999 + 1 - 1000)+1000;
    String email;
    String address;
}
class School {
    String schoolName;
    String schoolAddress;
    String schoolEmail;
    double schoolTuition;
    String web;
}
class Student{
    Info info = new Info();
    School school = new School();
}
