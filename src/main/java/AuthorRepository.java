import java.awt.print.Book;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Arrays;

public class AuthorRepository {
    private final Jdbcconnection jdbcconnection = new Jdbcconnection();

    public AuthorRepository() throws SQLException {
    }

    public void save(Author author) throws SQLException {
        Connection connection = jdbcconnection.getConnection();
        String saveAuthor = "INSERT INTO author(first_name,last_name,age)VALUES(?,?,?);";
        PreparedStatement preparedStatement = connection.prepareStatement(saveAuthor);
        preparedStatement.setString(1, author.getFirstName());
        preparedStatement.setString(2, author.getLastName());
        preparedStatement.setInt(3, author.getAge());
        preparedStatement.executeUpdate();
    }

    public Author load(int authorId) throws SQLException {
        Connection connection = jdbcconnection.getConnection();
        String loadAuthor = "SELECT * FROM author WHERE author_id=VALUES(?);";
        PreparedStatement preparedStatement = connection.prepareStatement(loadAuthor);
        preparedStatement.setInt(1, authorId);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()) {
            int authorID=authorId;
            String firstname=resultSet.getString("first_name");
            String lastname=resultSet.getString("last_name");
            int age=resultSet.getInt("age");
            return new Author(firstname,lastname,age);
        }else{
            System.out.println("author not found please register now");
            return new Author("not found","not found",-1);
        }

    }
}
