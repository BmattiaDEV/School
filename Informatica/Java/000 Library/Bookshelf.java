import java.util.ArrayList;

public class Bookshelf {
    ArrayList<Book> books;

    public Bookshelf(){
        books = new ArrayList<>();
    }

    public void addBook(Book l){
        books.add(l);
    }

    public String toString(){
        String out = "";

        for(Book b : books){
            out += b.toString();
        }
        return out;
    }
}
