package Day55.Task1;

import Day55.Task1.Book;

import java.util.ArrayList;

public class Library {
    final static ArrayList<Book> listBook = new ArrayList<>();
    static{
        listBook.add(new Book("Harry Potter", "J.K Rowling", 2001));
        listBook.add(new Book("The song of Ice and Fire", "M.Marting", 2011));
        listBook.add(new Book("The song of Ice and Fire2", "M.Marting", 2012));
    }

    public static Book oldBook(){

        Book oldestBook = listBook.get(0);

        for (int i = 0; i < listBook.size(); i++) {
            if (listBook.get(i).year < oldestBook.year) {
            oldestBook = listBook.get(i);
            }
        }
        return oldestBook;
    }
}
