package creational.builder.simple;

public class RunBuilderPatternSimple {
    public static void main(String[] args) {
        Book book = new Book.BookBuilder(1234567890123L)
                .withBookName("Simple Chaining Builder Pattern")
                .withAuthorName("Ivan Horak")
                .build();

        System.out.println(book.toString());
    }
}
