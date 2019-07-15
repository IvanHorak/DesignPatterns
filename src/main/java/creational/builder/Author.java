package creational.builder;

public class Author {
    private BookBuilder bookBuilder;

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public Author(String author) {
        this.name = author;
    }

    public void setBookBuilder(BookBuilder bookBuilder) {
        this.bookBuilder = bookBuilder;
    }

    public void constructBook() {
        this.bookBuilder.setAuthor(this);
        this.bookBuilder.setPublisher();
    }

    public Book getBook() {
        return this.bookBuilder.getBook();
    }

    public String getName() {
        return name;
    }
}
