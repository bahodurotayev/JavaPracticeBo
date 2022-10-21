package Day52.Bahodur.Task1;

import java.util.ArrayList;

public class School {
    private String name;
    private String phoneNumber;
    private String address;
    private int schoolSize;
    private ArrayList<Students> studentsList;

    public School() {
        this.studentsList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public int getSchoolSize() {
        return schoolSize;
    }

    public ArrayList<Students> getStudentsList() {
        return studentsList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setSchoolSize(int schoolSize) {
        this.schoolSize = schoolSize;
    }

    public void register(Students students) {
        if(studentsList.size() + 1 > this.schoolSize){
            throw new RuntimeException("Exceeded student limit");
        }
        studentsList.add(students);
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                ", schoolSize=" + schoolSize +
                ", studentsList=" + studentsList +
                '}';
    }
}
