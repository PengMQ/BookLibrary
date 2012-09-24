package Movie;

import java.util.ArrayList;

public class MovieList {
    ArrayList<Movie> movieList = new ArrayList<Movie>();
    public MovieList(){
        movieList = new ArrayList<Movie>();

    }

    public ArrayList<Movie> CreateMovieList() {
        movieList.add(new Movie("Pride and prejudice","Joe Write","10"));
        movieList.add(new Movie("Love Story","Arthur Hiller","9"));
        movieList.add(new Movie("Breakfast At Tiffany‘s","Blake Edwards","8"));
        movieList.add(new Movie("The Godfather","FrancisFordCoppola","10"));
        movieList.add(new Movie("Casablanca","Michael Curtiz","8"));
        movieList.add(new Movie("Roman Holiday","William Wyler","10"));
        movieList.add(new Movie("The Silence of the Lambs","Jonathan Demme","9"));
        movieList.add(new Movie("Leon","Luc Besson","10"));
        movieList.add(new Movie("Farewell My Concubine","Kaige Chen","8"));
        movieList.add(new Movie("Flower Like Years","Karwai Wong","10"));
        movieList.add(new Movie("Se7en","David Leo Fincher","6"));
        movieList.add(new Movie("Titanic","James Cameron","7"));
        movieList.add(new Movie("The Piano","Jane Campbell PiEn","8"));
        movieList.add(new Movie("Gone with the Wind","Victor Fleming","8"));
        movieList.add(new Movie("Brave Heart","Mel Gibson","N/A"));


        return movieList;
    }

    public String getEachMovieName(int i) {
        return movieList.get(i).GetMovieName();
    }

    public String getEachMovieDirector(int i) {
        return movieList.get(i).GetDirector();
    }

    public String getEachMovieRate(int i) {
        return movieList.get(i).GetRate();
    }
}
