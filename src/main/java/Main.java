import java.sql.Connection;
import java.sql.SQLException;

public class Main {



    public static void main(String[] args) throws SQLException {
        Author author=new Author();
        Book book=new Book();
        BookService bookService = new BookService();
        AuthorService authorService = new AuthorService();
        authorService.register("abolghasem", "ferdowsi", 7);
        authorService.load(1);
        bookService.addbook("shahname", 2024, 1);
        bookService.loadbook(1);
        bookService.deletebook(1);

    }
}