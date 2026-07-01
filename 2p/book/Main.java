public class Main {
    public static void main(String[] args) {

        Author author = new Author("Лев Толстой", "мужской", "tolstoy@example.com");
        Book book = new Book("Война и мир", author, 1869);

        System.out.println(book);
    }
}
