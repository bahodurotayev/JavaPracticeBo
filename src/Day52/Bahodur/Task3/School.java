package Day52.Bahodur.Task3;

import java.util.ArrayList;
import java.util.List;

public class School {
    private String name;
    private String phoneNumber;
    private String email;
    private String address;
    private int schoolSize;
    private ArrayList<Student> studentList;

    public School() {
        studentList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSchoolSize() {
        return schoolSize;
    }

    public void setSchoolSize(int schoolSize) {
        this.schoolSize = schoolSize;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void register(Student student) {
        if (studentList.size() + 1> schoolSize){
            throw new RuntimeException("You exceeded limit no more student");
        }
        this.studentList.add(student);
    }

    @Override
    public String toString() {
        return "School{" +
                "name='" + name + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", schoolSize=" + schoolSize +
                ", studentList=" + studentList +
                '}';
    }
}
