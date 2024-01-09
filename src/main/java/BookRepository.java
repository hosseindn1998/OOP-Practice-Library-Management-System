import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BookRepository implements CRUD {
    private final Jdbcconnection jdbcconnection=new Jdbcconnection();

    public BookRepository() throws SQLException {
    }
@Override
public void save(Book book) throws SQLException {
        Connection connection= jdbcconnection.getConnection();
        String saveBook="INSERT INTO book(title,year,authorID)VALUES(?,?,?);";
        PreparedStatement preparedStatement=connection.prepareStatement(saveBook);
        preparedStatement.setString(1,book.getTitle());
        preparedStatement.setInt(2,book.getYear());
        preparedStatement.setInt(3,book.getAuthorID());

        preparedStatement.executeUpdate();
    }
}
