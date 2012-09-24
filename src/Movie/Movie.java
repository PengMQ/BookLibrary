package Movie;
import java.lang.*;

public class Movie {
    private String movieName;
    private String director;
    private String   rate;

    public Movie(String movieName, String director, String  rate) {
        this.movieName = movieName;
        this.director = director;
        this.rate = rate;
    }

    public String PrintOneMovie() {
        StringBuffer space= new StringBuffer();
        String space1 = "";
        String space2 = "";
        for(int i = 0;i <26 - GetMovieName() .length();i ++)
        {
            space.append(" ");
        }
        space1 = space.toString();
        space.delete(0,space.length());
        for(int j = 0;j <20 - GetDirector().length();j ++){
            space.append(" ");

        }
        space2 = space.toString();
        return movieName + space1 + director  + space2 + rate + "\n";
    }
    String GetMovieName(){
        return movieName ;
    }
    String GetDirector(){
        return director;
    }
    String GetRate(){
        return rate;
    }
}
