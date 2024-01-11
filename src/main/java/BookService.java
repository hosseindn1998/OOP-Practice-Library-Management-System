import java.sql.SQLException;
import java.util.Scanner;

public class BookService {
    private final Scanner scanner=new Scanner(System.in);
    private final BookRepository bookRepository=new BookRepository();

    public BookService() throws SQLException {
    }

    public void addbook(String title,int year,int authorID) throws SQLException {
        Book book=new Book(title,year,authorID);
        bookRepository.save(book);
        System.out.println("Book "+book.getTitle()+"added seccessfully");
    }
    public Book loadbook(int bookid) throws SQLException {

        System.out.println(bookRepository.load(bookid));
        Book book = bookRepository.load(bookid);
        return book;
    }
    public void deletebook(int bookid) throws SQLException {
        Book book= loadbook(bookid);
        bookRepository.delete(book);
    }
}
