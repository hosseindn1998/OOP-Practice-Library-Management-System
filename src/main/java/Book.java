public class Book {
    private int bookId;
    private String title;
    private int year;
    private int authorID;

    public Book(){

    }

    public Book(String title, int year, int authorID) {
        this.title = title;
        this.year = year;
        this.authorID = authorID;
    }

    public Book(int bookId, String title, int year, int authorID) {
        this.bookId = bookId;
        this.title = title;
        this.year = year;
        this.authorID = authorID;
    }

    public int getBookId() {
        return bookId;
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

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", authorID=" + authorID +
                '}';
    }
}
