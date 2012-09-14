package Book;

import java.util.ArrayList;

public class BookList {
    ArrayList<Book> bookList;
    public BookList(){
        bookList = new ArrayList<Book>();

    }
    public ArrayList<Book> CreateBookList() {
        bookList.add(new Book("bookA","valid"));
        bookList.add(new Book("bookB","valid"));
        bookList.add(new Book("bookC","invalid"));
        bookList.add(new Book("bookD","invalid"));
        return bookList;
    }
    public String getEachBookName(int i){
        return bookList.get(i).getBookName();
    }
    public String getEachBookStatus(int i){
        return bookList.get(i).getBookStatus();
    }


}
