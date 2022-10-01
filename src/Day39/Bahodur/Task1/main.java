package Day39.Bahodur.Task1;

public class main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.createAnimal("puma", 30);
        animal.convertMile();
        animal.setShortName();

        System.out.println(animal);
    }
}
