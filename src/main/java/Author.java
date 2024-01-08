import java.util.Arrays;

public class Author {
    private String firstName;
    private String lastName;
    private int age;
    private Book []book=new Book[1000];
    public Author(){

    }

    public Author(String firstName, String lastName, int age, Book[] book) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.book = book;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getBook() {
        return book;
    }

    public void setBook(String[] book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", book=" + Arrays.toString(book) +
                '}';
    }
}
