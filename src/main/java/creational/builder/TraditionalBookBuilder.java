package creational.builder;

public class TraditionalBookBuilder implements BookBuilder {
    private Book book;

    public TraditionalBookBuilder() {
        this.book = new Book();
    }

    @Override
    public void setAuthor(Author author) {
        author.setName(author.getName() + "- TRADITIONAL");
        this.book.setAuthor(author);
    }

    @Override
    public void setPublisher() {
        this.book.setPublisher("TRADITIONAL PUBLISHER");
    }

    @Override
    public Book getBook() {
        return book;
    }
}
