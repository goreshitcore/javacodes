import java.lang.reflect.*;

public class Book {
	
	private String title;
	private String author;
	// constructor
	public Book(String title, String author) {
        this.title = title;
        this.author = author;
		
	}
	// get methods
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
	
    public static void main(String[] args) {
    	// new book instance with constructor input
        Book book = new Book("Pride and Prejudice", "Jane Austen");
        System.out.println("title = " + book.getTitle());
        System.out.println("author = " + book.getAuthor());
    }
	

}
