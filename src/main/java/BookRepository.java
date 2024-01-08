public class BookRepository {
    private String title;
    private int year;
    private int authorID;

    public BookRepository(){

    }

    public BookRepository(String title, int year, int authorID) {
        this.title = title;
        this.year = year;
        this.authorID = authorID;
    }
}
