package Day52.Bahodur.Task3;

public class Management {
    public static void main(String[] args) {
        School school = new School();
        school.setName("Exelenter");
        school.setAddress("123 Bond St");
        school.setEmail("Exelenter@ex.com");
        school.setSchoolSize(5);
        school.setPhoneNumber("929 732 0943");

        school.register(new Student("Ahmat", "Rahmat"));
        school.register(new Student("John", "Wick"));
        school.register(new Student("Tony", "Roy"));
        school.register(new Student("Dustin ", "Chandler "));
        school.register(new Student("Khabib", "Nur"));
        school.register(new Student("Ahmat", "Rahmat"));


        System.out.println(school);
    }
}
