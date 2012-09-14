package TestBook;

import Book.BookList;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class TestBookList {
    @Test
    public void getEachBookName() throws Exception {
        BookList bookList = new BookList();
        bookList.CreateBookList();
        assertEquals(bookList.getEachBookName(0), "bookA");
        assertEquals(bookList.getEachBookName(1), "bookB");
        assertEquals(bookList.getEachBookName(2), "bookC");
        assertEquals(bookList.getEachBookName(3), "bookD");
    }

    @Test
    public void getEachBookStatus() throws Exception {
        BookList bookList = new BookList();
        bookList.CreateBookList();
        assertEquals(bookList.getEachBookStatus(0), "valid");
        assertEquals(bookList.getEachBookStatus(1), "valid");
        assertEquals(bookList.getEachBookStatus(2), "invalid");
        assertEquals(bookList.getEachBookStatus(3), "invalid");
        
    }
}
