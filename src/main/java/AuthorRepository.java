import java.awt.print.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

public class AuthorRepository {
    private final Jdbcconnection jdbcconnection=new Jdbcconnection();

    public AuthorRepository() throws SQLException {
    }

    public void save (Author author) throws SQLException {
        Connection connection= jdbcconnection.getConnection();
        String saveAuthor="INSERT INTO author(first_name,last_name,age,book)VALUES(?,?,?,?);";
        PreparedStatement preparedStatement=connection.prepareStatement(saveAuthor);
        preparedStatement.setString(1,author.getFirstName());
        preparedStatement.setString(2,author.getLastName());
        preparedStatement.setInt(3,author.getAge());
        preparedStatement.setArray(4, connection.createArrayOf("Book", ));
        preparedStatement.executeUpdate();
    }

}
