package Day52.Bahodur.Task2;

public class Application {
    public static void main(String[] args) {
        Movie movie = new Movie("Game of Thrones", 2011, 2.99, 19.99);
        Movie movie2 = new Movie("House of Dragon", 2022, 4.99, 39.99);
        Movie movie3 = new Movie("American History  ", 2006, 0.99, 9.99);

        Cinema alpha = new Cinema();
        alpha.addMovie(movie);
        alpha.addMovie(movie2);
        alpha.addMovie(movie3);

        alpha.removeMovie(movie);
        alpha.print();
    }
}
