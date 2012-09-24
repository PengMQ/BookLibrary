package TestMovie;

import Movie.Movie;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestMovie {
    @Test
    public void PrintOneMovie() throws Exception {
        String printContent = "Pride and Prejudice       Joe Write           10\n";
        Movie movie = new Movie("Pride and Prejudice","Joe Write","10");
        assertEquals(printContent,movie.PrintOneMovie());

        String printContent2 = "Love Story                Arthur Hiller       9\n";
        Movie movie2 = new Movie("Love Story","Arthur Hiller","9");
        assertEquals(printContent2,movie2.PrintOneMovie());

        String printContent3 = "Brave Heart              Mel Gibson          N/A";
        Movie movie3 = new Movie("Brave Heart","Mel Gibson","N/A");
        assertEquals(printContent2,movie2.PrintOneMovie());


    }


}
