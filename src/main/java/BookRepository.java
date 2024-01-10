import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BookRepository{
    private final Jdbcconnection jdbcconnection=new Jdbcconnection();

    public BookRepository() throws SQLException {
    }

public void save(Book book) throws SQLException {
        Connection connection= jdbcconnection.getConnection();
        String saveBook="INSERT INTO book(title,year,authorID)VALUES(?,?,?);";
        PreparedStatement preparedStatement=connection.prepareStatement(saveBook);
        preparedStatement.setString(1,book.getTitle());
        preparedStatement.setInt(2,book.getYear());
        preparedStatement.setInt(3,book.getAuthorID());
        preparedStatement.executeUpdate();
    }
    public Book load (int bookId) throws SQLException {
        Connection connection = jdbcconnection.getConnection();
        String loadBook = "SELECT * FROM book WHERE book_id=VALUES(?);";
        PreparedStatement preparedStatement = connection.prepareStatement(loadBook);
        preparedStatement.setInt(1, bookId);
        ResultSet resultSet = preparedStatement.executeQuery();
        if(resultSet.next()) {
            int bookID=bookId;
            String title=resultSet.getString("title");
            int year=resultSet.getInt("year");
            int authorID=resultSet.getInt("authorid");
            return new Book(title,year,authorID);
        }else{
            System.out.println("author not found please register now");
            return new Book("not found",-1,-1);
        }

    }
}
