public class Book {
    // Declare instance variables
    String title;
    String author;

    // Constructor method
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public static void main(String[] args) {
        // Create an instance of Book using the constructor
        Book book = new Book("Pride and Prejudice", "Jane Austen");

        // Print instance variables
        System.out.printf("Title = %s", book.title);
        System.out.printf("\nAuthor = %s", book.author);
    }
}