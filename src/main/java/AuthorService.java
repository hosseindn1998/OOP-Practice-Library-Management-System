
import java.sql.SQLException;
import java.util.Scanner;

public class AuthorService {

    public void register(String firstname,String lastname,int age) throws SQLException {
        Author author=new Author(firstname,lastname,age);
        AuthorRepository authorRepository=new AuthorRepository();
        authorRepository.save(author);

        System.out.println("Dear"+author.getFirstName()+", your sign up Completed ,You can sign in now.");
    }
    public void load(int authorId) throws SQLException {

        AuthorRepository authorRepository=new AuthorRepository();
        System.out.println(authorRepository.load(authorId));

    }

}
