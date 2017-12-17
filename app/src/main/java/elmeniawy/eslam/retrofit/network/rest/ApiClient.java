package elmeniawy.eslam.retrofit.network.rest;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * ApiClient
 * <p>
 * Created by Eslam El-Meniawy on 26-Oct-2017.
 * CITC - Mansoura University
 */

public class ApiClient {
    public static final String BASE_URL = "https://yts.ag/api/v2/";
    private static Retrofit retrofit = null;

    public static Retrofit getClient() {
        if (retrofit==null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }
}
