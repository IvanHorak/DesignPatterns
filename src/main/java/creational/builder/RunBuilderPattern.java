package creational.builder;

public class RunBuilderPattern {
    public static void main(String[] args) {
        Author independentAuthor = new Author("Ivan Horak");

        independentAuthor.setBookBuilder(new IndependentBookBuilder());
        independentAuthor.constructBook();

        Book independentBook = independentAuthor.getBook();
        System.out.println("Independent book has author: " + independentBook.getAuthor().getName());
        System.out.println("Independent book has publisher: " + independentBook.getPublisher());

        Author traditionalAuthor = new Author("Ivan Horak");
        traditionalAuthor.setBookBuilder(new TraditionalBookBuilder());
        traditionalAuthor.getBook().setAuthor(traditionalAuthor);
        traditionalAuthor.constructBook();

        Book traditionalBook = traditionalAuthor.getBook();
        System.out.println("Traditional book has author: " + traditionalBook.getAuthor().getName());
        System.out.println("Traditional book has publisher: " + traditionalBook.getPublisher());
    }
}
