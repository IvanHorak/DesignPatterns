package creational.builder;

public class Book {
    private Author author;
    private String publisher;
    public static BookBuilder bookBuilder;

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public BookBuilder getBookBuilder() {
        return bookBuilder;
    }

    public void setBookBuilder(BookBuilder bookBuilder) {
        this.bookBuilder = bookBuilder;
    }
}
