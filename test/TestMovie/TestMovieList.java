package TestMovie;


import Movie.MovieList;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestMovieList {
    @Test
    public void CreateMovieList() throws Exception {
        MovieList bookList = new MovieList();
        bookList.CreateMovieList();
        assertEquals(bookList.getEachMovieName(0), "Pride and prejudice");
        assertEquals(bookList.getEachMovieName(14), "Brave Heart");

        assertEquals(bookList.getEachMovieDirector(0), "Joe Write");
        assertEquals(bookList.getEachMovieDirector(14), "Mel Gibson");

        assertEquals(bookList.getEachMovieRate(0), "10");
        assertEquals(bookList.getEachMovieRate(14), "N/A");
    }
}
