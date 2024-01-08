public class AuthorRepository {
    private String firstName;
    private String lastName;
    private int age;
    private String []book=new String[1000];
    public AuthorRepository(){

    }

    public AuthorRepository(String firstName, String lastName, int age, String[] book) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.book = book;
    }
}
