package elmeniawy.eslam.retrofit.fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.AppCompatTextView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.google.gson.Gson;

import java.util.List;

import elmeniawy.eslam.retrofit.R;
import elmeniawy.eslam.retrofit.network.model.Movie;
import elmeniawy.eslam.retrofit.network.model.MovieResponse;
import elmeniawy.eslam.retrofit.network.rest.ApiClient;
import elmeniawy.eslam.retrofit.network.rest.ApiInterface;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment {

    private static final String TAG = FirstFragment.class.getSimpleName();

    public FirstFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_first, container, false);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    @Override
    public void onStart() {
        super.onStart();

        ApiInterface apiService =
                ApiClient.getClient().create(ApiInterface.class);

        Call<MovieResponse> call = apiService.getLatestMovies(20);

        call.enqueue(new Callback<MovieResponse>() {
            @SuppressWarnings("ConstantConditions")
            @Override
            public void onResponse(@NonNull Call<MovieResponse> call, @NonNull Response<MovieResponse> response) {
                Toast.makeText(getContext(), response.body().getMessage(), Toast.LENGTH_SHORT).show();
                ((AppCompatTextView) getView().findViewById(R.id.result)).setText(new Gson().toJson(response.body()));
                List<Movie> movies = response.body().getData().getMovies();
                Log.d(TAG, "Number of movies received: " + movies.size());
                getView().findViewById(R.id.result).setVisibility(View.VISIBLE);
                getView().findViewById(R.id.loading).setVisibility(View.GONE);
            }

            @Override
            public void onFailure(@NonNull Call<MovieResponse> call, @NonNull Throwable t) {
                Log.e(TAG, t.toString());
            }
        });
    }
}
