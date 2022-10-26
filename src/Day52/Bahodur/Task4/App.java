package Day52.Bahodur.Task4;

import Day52.Java.Task2.Cinema;
import Day52.Java.Task2.Movie;

public class App {
    public static void main(String[] args) {
        Day52.Java.Task2.Movie superman = new Day52.Java.Task2.Movie("The Death and Return of Superman", "01 01 2019");
        superman.setRentPrice(2.99);
        superman.setBuyPrice(19.99);

        Day52.Java.Task2.Movie eraser = new Day52.Java.Task2.Movie("Eraser: Reborn", "02 10 2022");
        eraser.setRentPrice(4.99);
        eraser.setBuyPrice(13.99);

        Day52.Java.Task2.Movie maverick = new Day52.Java.Task2.Movie("Top Gun: Maverick", "05 15 2022");
        maverick.setRentPrice(5.99);
        maverick.setBuyPrice(19.99);

        Day52.Java.Task2.Cinema cinema = new Cinema();
        cinema.addMovie(superman);
        cinema.addMovie(eraser);
        cinema.addMovie(maverick);

        for (Day52.Java.Task2.Movie listOfMovie : cinema.getListOfMovies()) {
            System.out.println(listOfMovie);
        }

        cinema.removeMovie("The Death and Return of Superman");

        System.out.println("===========After removeMovie==============");

        for (Movie listOfMovie : cinema.getListOfMovies()) {
            System.out.println(listOfMovie);
        }
    }
}
