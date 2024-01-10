import java.sql.SQLException;
import java.util.Scanner;

public class BookService {
    private final Scanner scanner=new Scanner(System.in);
    public void addbook(String title,int year,int authorID) throws SQLException {
        Book book=new Book(title,year,authorID);
        BookRepository bookRepository=new BookRepository();
        bookRepository.save(book);
        System.out.println("Book "+book.getTitle()+"added seccessfully");
    }
}
