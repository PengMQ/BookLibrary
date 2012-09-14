package Book;
public class Book {
    private String name;
    private String status;

    public Book(String name, String status){
        this.name =name;
        this.status = status;
    }
    public String getBookName(){
        return name;

    }
    public String getBookStatus(){
        return status;
    }
}
