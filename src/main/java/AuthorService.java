
import java.sql.SQLException;
import java.util.Scanner;

public class AuthorService {
    private final Scanner scanner=new Scanner(System.in);
    public void register(String firstname,String lastname,int age) throws SQLException {
        Author author=new Author(firstname,lastname,age);
        AuthorRepository authorRepository=new AuthorRepository();
        authorRepository.save(author);
        System.out.println("Dear"+author.getFirstName()+", your sign up Completed ,You can sign in now.");
    }
}
