package Day52.Bahodur.Task4;

import java.util.ArrayList;
import java.util.List;

public class Cinema {
    private final List<Movie> movieList = new ArrayList<>();

    public List<Movie> getMovieList() {
        return movieList;
    }
    public void addMovie(Movie movie){
        this.movieList.add(movie);
    }
    public void removeMovie(Movie movie){
        this.movieList.remove(movie);
    }
    public void removeMovie(String movieName){
        this.movieList.removeIf(movie -> movie.getName().equals(movieName));
    }

    @Override
    public String toString() {
        return "Cinema{" +
                "movieList=" + movieList +
                '}';
    }
}
