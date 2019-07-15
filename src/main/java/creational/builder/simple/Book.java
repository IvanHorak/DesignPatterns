package creational.builder.simple;

public class Book {
    private long isbn;
    private String bookName;
    private String authorName;

    @Override
    public String toString() {
        return "Book name: " + bookName + "\n"
                + "Author: " + authorName + "\n"
                + "ISBN: " + isbn;
    }

    public static class BookBuilder {
        private long isbn;
        private String bookName;
        private String authorName;

        public BookBuilder(long isbn) {
            this.isbn = isbn;
        }

        public BookBuilder withBookName(String bookName) {
            this.bookName = bookName;

            return this;
        }

        public BookBuilder withAuthorName(String authorName) {
            this.authorName = authorName;

            return this;
        }

        public Book build() {
            Book book = new Book();
            book.isbn = this.isbn;
            book.bookName = this.bookName;
            book.authorName = this.authorName;

            return book;
        }
    }
}
