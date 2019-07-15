package creational.builder;

public class IndependentBookBuilder implements BookBuilder {
    private Book book;

    @Override
    public void setAuthor(Author author) {
        author.setName(author.getName() + "- INDEPENDENT");
        this.book.setAuthor(author);
    }

    @Override
    public void setPublisher() {
        this.book.setPublisher("INDEPENDENT PUBLISHER");
    }

    @Override
    public Book getBook() {
        return book;
    }

    public IndependentBookBuilder() {
        this.book = new Book();
    }
}
