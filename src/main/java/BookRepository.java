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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getAuthorID() {
        return authorID;
    }

    public void setAuthorID(int authorID) {
        this.authorID = authorID;
    }
}
