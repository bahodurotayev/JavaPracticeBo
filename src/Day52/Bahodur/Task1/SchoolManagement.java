package Day52.Bahodur.Task1;

public class SchoolManagement {
    public static void main(String[] args) {
        School school = new School();
        school.setName("Exelenter");
        school.setAddress("123 Bond street");
        school.setPhoneNumber("123-456-1782");
        school.setSchoolSize(2);

        Students students = new Students("Ali", "Vali");
        Students students2 = new Students("Ahmat", "Rahmat");

        school.register(students);
        school.register(students2);

        System.out.println(school);






    }
}
