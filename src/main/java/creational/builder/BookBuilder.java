package creational.builder;

public interface BookBuilder {
    void setAuthor(Author author);

    void setPublisher();

    Book getBook();

}
