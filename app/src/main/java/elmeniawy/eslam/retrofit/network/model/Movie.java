package elmeniawy.eslam.retrofit.network.model;

/**
 * Movie
 * <p>
 * Created by Eslam El-Meniawy on 26-Oct-2017.
 * CITC - Mansoura University
 */

public class Movie {
    private long id;
    private String title;
    private int year;

    public Movie(long id, String title, int year) {
        this.id = id;
        this.title = title;
        this.year = year;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
