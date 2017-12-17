package elmeniawy.eslam.retrofit.network.rest;

import elmeniawy.eslam.retrofit.network.model.MovieResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * ApiInterface
 * <p>
 * Created by Eslam El-Meniawy on 26-Oct-2017.
 * CITC - Mansoura University
 */

public interface ApiInterface {
    @GET("list_movies.json")
    Call<MovieResponse> getLatestMovies(@Query("limit") int limit);

    @GET("movie_details.json")
    Call<MovieResponse> getMovieDetails(@Query("movie_id") long id);
}
