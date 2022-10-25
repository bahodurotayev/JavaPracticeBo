package Day55.Task1;

public class App {
    public static void main(String[] args) {

        Book book1 = new Book("Sherlock Holmes", "JJB", 1956);
        Library.listBook.add(book1);

        System.out.println(Library.oldBook());


    }
}
