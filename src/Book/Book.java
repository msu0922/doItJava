package Book;

public class Book {
    private String bookName;
    private String author;

    public Book() {
    }

    public Book(String name, String author) {
        this.bookName = name;
        this.author = author;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String name) {
        this.bookName = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void showInfo() {
System.out.println(bookName + ", " + author);
    }
}
