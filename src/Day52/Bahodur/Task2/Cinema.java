package Day52.Bahodur.Task2;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private final List<Movie> movieList = new ArrayList<>();

    public List<Movie> getMovieList() {
        return movieList;
    }

    public void addMovie(Movie movie) {
        this.movieList.add(movie);
    }
    public void removeMovie(Movie movie) {
        this.movieList.remove(movie);
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "movieList=" + movieList +
                '}';
    }
    public void print(){
        for (int i = 0; i < this.movieList.size(); i++) {
            System.out.println(this.movieList.get(i));
        }
    }
}
