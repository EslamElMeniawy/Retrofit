package elmeniawy.eslam.retrofit.network.model;

import java.util.List;

/**
 * MovieData
 * <p>
 * Created by Eslam El-Meniawy on 26-Oct-2017.
 * CITC - Mansoura University
 */

public class MovieData {
    private List<Movie> movies;
    private Movie movie;

    public List<Movie> getMovies() {
        return movies;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }
}
