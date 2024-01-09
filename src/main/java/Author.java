import java.sql.Array;
import java.util.Arrays;

public class Author {
    private String firstName;
    private String lastName;
    private int age;
    private int []bookIDs=new int[1000];
    public Author(){

    }

    public Author(String firstName, String lastName, int age, int[] bookIDs) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.bookIDs = bookIDs;
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

    public int[] getBook() {
        return bookIDs;
    }

    public void setBook(int[] bookIDs) {
        this.bookIDs = bookIDs;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", book=" + Arrays.toString(bookIDs) +
                '}';
    }
}
