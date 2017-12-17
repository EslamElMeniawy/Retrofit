package elmeniawy.eslam.retrofit.network.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * MovieResponse
 * <p>
 * Created by Eslam El-Meniawy on 26-Oct-2017.
 * CITC - Mansoura University
 */

public class MovieResponse {
    @SerializedName("status_message")
    private String message;
    private MovieData data;

    public String getMessage() {
        return message;
    }

    public MovieData getData() {
        return data;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setData(MovieData data) {
        this.data = data;
    }
}
