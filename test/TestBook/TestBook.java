package TestBook;
import Book.*;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestBook {
    @Test
    public void getBookName() throws Exception {
        Book bookA = new Book("bookA","valid");
        assertEquals("bookA",bookA.getBookName());
    }
    @Test
    public void getBookStatus() throws Exception {
        Book bookA = new Book("bookA","valid");
        assertEquals("valid",bookA.getBookStatus());

    }
}
